; SSL_group_to_name @ 009aa95c
009aa95c	str x19,[sp, #-0x20]!
009aa960	mov x19,x0
009aa964	stp x29,x30,[sp, #0x10]
009aa968	add x29,sp,#0x10
009aa96c	tbnz w1,#0x18,0x009aa980
009aa970	mov w0,w1
009aa974	bl 0x00c34af0
009aa978	and w1,w0,#0xffff
009aa97c	b 0x009aa984
009aa980	and w1,w1,#0xffff
009aa984	ldr x0,[x19, #0x9a8]
009aa988	bl 0x00c34ae0
009aa98c	cbz x0,0x009aa994
009aa990	ldr x0,[x0]
009aa994	ldp x29,x30,[sp, #0x10]
009aa998	ldr x19,[sp], #0x20
009aa99c	ret
