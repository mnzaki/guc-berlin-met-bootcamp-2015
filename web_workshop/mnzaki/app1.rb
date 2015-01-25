require "sinatra"

get "/" do
  "it works!"
end

get "/:name/:age" do
  erb :it_works, {:locals => {:name => params[:name],
                              :age  => params[:age].to_i}}
end
