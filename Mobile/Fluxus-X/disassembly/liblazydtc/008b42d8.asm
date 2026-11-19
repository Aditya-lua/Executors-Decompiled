; FUN_008b42d8 @ 008b42d8
008b42d8	stp x29,x30,[sp, #-0x10]!
008b42dc	mov x29,sp
008b42e0	ldrh w8,[x0, #0x28]
008b42e4	cmp w8,#0xc8
008b42e8	b.eq 0x008b42fc
008b42ec	cmp w8,#0xe1
008b42f0	b.cs 0x008b4308
008b42f4	ldp x29,x30,[sp], #0x10
008b42f8	ret
008b42fc	adrp x1,0x2a7000
008b4300	add x1,x1,#0x1c7
008b4304	bl 0x008b39cc
008b4308	mov w1,#0x5
008b430c	bl 0x008b3f9c
