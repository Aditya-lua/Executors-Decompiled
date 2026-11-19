; FUN_00bf8954 @ 00bf8954
00bf8954	paciasp
00bf8958	sub sp,sp,#0x50
00bf895c	stp x29,x30,[sp, #0x20]
00bf8960	stp x22,x21,[sp, #0x30]
00bf8964	stp x20,x19,[sp, #0x40]
00bf8968	add x29,sp,#0x20
00bf896c	adrp x20,0xcb5000
00bf8970	mov x19,x1
00bf8974	mov x21,x0
00bf8978	ldr x20,[x20, #0xc70]
00bf897c	str x20,[sp, #0x8]
00bf8980	ldar x8,[x20]
00bf8984	cmn x8,#0x1
00bf8988	b.eq 0x00bf89b4
00bf898c	add x8,sp,#0x8
00bf8990	sub x9,x29,#0x8
00bf8994	adrp x0,0xcb5000
00bf8998	stur x8,[x29, #-0x8]
00bf899c	nop
00bf89a0	adr x2,0xc0bab0
00bf89a4	str x9,[sp, #0x10]
00bf89a8	add x1,sp,#0x10
00bf89ac	ldr x0,[x0, #0xc70]
00bf89b0	bl 0x00c305d0
00bf89b4	ldp x8,x10,[x19, #0x10]
00bf89b8	ldrsw x9,[x20, #0x8]
00bf89bc	sub x22,x9,#0x1
00bf89c0	sub x9,x10,x8
00bf89c4	cmp x22,x9, ASR #0x3
00bf89c8	b.cs 0x00bf8a68
00bf89cc	ldr x19,[x8, x22, LSL #0x3]
00bf89d0	cbz x19,0x00bf8a68
00bf89d4	add x1,x19,#0x8
00bf89d8	mov w0,#0x1
00bf89dc	bl 0x00c2bce0
00bf89e0	mov x20,x21
00bf89e4	ldp x8,x9,[x20, #0x10]!
00bf89e8	sub x9,x9,x8
00bf89ec	asr x10,x9,#0x3
00bf89f0	cmp x10,x22
00bf89f4	b.hi 0x00bf8a20
00bf89f8	add x9,x22,#0x1
00bf89fc	subs x1,x9,x10
00bf8a00	b.ls 0x00bf8a14
00bf8a04	mov x0,x20
00bf8a08	bl 0x00c0b6e4
00bf8a0c	ldr x8,[x20]
00bf8a10	b 0x00bf8a20
00bf8a14	b.cs 0x00bf8a20
00bf8a18	add x9,x8,x9, LSL #0x3
00bf8a1c	str x9,[x21, #0x18]
00bf8a20	ldr x21,[x8, x22, LSL #0x3]
00bf8a24	cbz x21,0x00bf8a48
00bf8a28	add x1,x21,#0x8
00bf8a2c	mov x0,#-0x1
00bf8a30	bl 0x00c2bd10
00bf8a34	cbnz x0,0x00bf8a48
00bf8a38	ldr x8,[x21]
00bf8a3c	mov x0,x21
00bf8a40	ldr x8,[x8, #0x10]
00bf8a44	blr x8
00bf8a48	ldr x8,[x20]
00bf8a4c	str x19,[x8, x22, LSL #0x3]
00bf8a50	ldp x20,x19,[sp, #0x40]
00bf8a54	ldp x22,x21,[sp, #0x30]
00bf8a58	ldp x29,x30,[sp, #0x20]
00bf8a5c	add sp,sp,#0x50
00bf8a60	autiasp
00bf8a64	ret
00bf8a68	bl 0x00bd8968
