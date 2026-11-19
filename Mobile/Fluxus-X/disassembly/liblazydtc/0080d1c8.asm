; FUN_0080d1c8 @ 0080d1c8
0080d1c8	stp x29,x30,[sp, #-0x20]!
0080d1cc	str x19,[sp, #0x10]
0080d1d0	mov x29,sp
0080d1d4	ldr x19,[x0, #0x8]
0080d1d8	cbz x19,0x0080d1ec
0080d1dc	add x1,x19,#0x8
0080d1e0	mov x0,#-0x1
0080d1e4	bl 0x00c2bd10
0080d1e8	cbz x0,0x0080d1f8
0080d1ec	ldr x19,[sp, #0x10]
0080d1f0	ldp x29,x30,[sp], #0x20
0080d1f4	ret
0080d1f8	ldr x8,[x19]
0080d1fc	mov x0,x19
0080d200	ldr x8,[x8, #0x10]
0080d204	blr x8
0080d208	mov x0,x19
0080d20c	ldr x19,[sp, #0x10]
0080d210	ldp x29,x30,[sp], #0x20
0080d214	b 0x00c2ff00
