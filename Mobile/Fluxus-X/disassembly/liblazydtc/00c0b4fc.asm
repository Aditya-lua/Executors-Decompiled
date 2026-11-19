; FUN_00c0b4fc @ 00c0b4fc
00c0b4fc	paciasp
00c0b500	stp x29,x30,[sp, #-0x20]!
00c0b504	str x19,[sp, #0x10]
00c0b508	mov x29,sp
00c0b50c	mov x19,x0
00c0b510	bl 0x00c31530
00c0b514	mov x0,x19
00c0b518	mov w1,#0x10
00c0b51c	ldr x19,[sp, #0x10]
00c0b520	ldp x29,x30,[sp], #0x20
00c0b524	autiasp
00c0b528	b 0x00c2fe80
