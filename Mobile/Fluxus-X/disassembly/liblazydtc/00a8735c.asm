; FUN_00a8735c @ 00a8735c
00a8735c	stp x24,x23,[sp, #-0x40]!
00a87360	stp x22,x21,[sp, #0x10]
00a87364	stp x20,x19,[sp, #0x20]
00a87368	stp x29,x30,[sp, #0x30]
00a8736c	add x29,sp,#0x30
00a87370	mov x22,x3
00a87374	mov x19,x2
00a87378	mov x20,x1
00a8737c	mov x21,x0
00a87380	bl 0x00c36d40
00a87384	sxtw x23,w0
00a87388	mov x0,x21
00a8738c	bl 0x00c3cea0
00a87390	cmp x23,x22
00a87394	b.hi 0x00a873c4
00a87398	mov x21,x0
00a8739c	mov x24,xzr
00a873a0	sub x22,x22,x23
00a873a4	ldr x8,[x21, #0xf8]
00a873a8	add x0,x19,x24
00a873ac	add x1,x20,x24
00a873b0	mov x2,x21
00a873b4	blr x8
00a873b8	add x24,x24,x23
00a873bc	cmp x24,x22
00a873c0	b.ls 0x00a873a4
00a873c4	ldp x29,x30,[sp, #0x30]
00a873c8	ldp x20,x19,[sp, #0x20]
00a873cc	ldp x22,x21,[sp, #0x10]
00a873d0	mov w0,#0x1
00a873d4	ldp x24,x23,[sp], #0x40
00a873d8	ret
