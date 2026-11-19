; std::__ndk1::function<void(unsigned_long,bool)>::~function @ 0098c9f4
0098c9f4	mov x8,x0
0098c9f8	ldr x0,[x0, #0x20]
0098c9fc	cmp x8,x0
0098ca00	b.eq 0x0098ca14
0098ca04	cbz x0,0x0098ca20
0098ca08	ldr x8,[x0]
0098ca0c	ldr x1,[x8, #0x28]
0098ca10	br x1
0098ca14	ldr x8,[x0]
0098ca18	ldr x1,[x8, #0x20]
0098ca1c	br x1
0098ca20	ret
