; FUN_00828f8c @ 00828f8c
00828f8c	cbz x1,0x00828fe4
00828f90	stp x29,x30,[sp, #-0x20]!
00828f94	stp x20,x19,[sp, #0x10]
00828f98	mov x29,sp
00828f9c	mov x19,x1
00828fa0	ldr x1,[x1]
00828fa4	mov x20,x0
00828fa8	bl 0x00828f8c
00828fac	ldr x1,[x19, #0x8]
00828fb0	mov x0,x20
00828fb4	bl 0x00828f8c
00828fb8	ldrb w8,[x19, #0x28]
00828fbc	tbz w8,#0x0,0x00828fd0
00828fc0	ldr x8,[x19, #0x28]
00828fc4	ldr x0,[x19, #0x38]
00828fc8	and x1,x8,#-0x2
00828fcc	bl 0x00c2fe80
00828fd0	mov x0,x19
00828fd4	mov w1,#0x40
00828fd8	ldp x20,x19,[sp, #0x10]
00828fdc	ldp x29,x30,[sp], #0x20
00828fe0	b 0x00c2fe80
00828fe4	ret
