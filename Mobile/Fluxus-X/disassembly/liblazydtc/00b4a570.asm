; FUN_00b4a570 @ 00b4a570
00b4a570	stp x22,x21,[sp, #-0x30]!
00b4a574	stp x20,x19,[sp, #0x10]
00b4a578	stp x29,x30,[sp, #0x20]
00b4a57c	ldr x22,[x0]
00b4a580	add x20,x0,#0x8
00b4a584	mov x19,x0
00b4a588	mov x0,x20
00b4a58c	add x29,sp,#0x20
00b4a590	bl 0x00c41170
00b4a594	ldp x0,x1,[x19, #0x20]
00b4a598	adrp x21,0x2ae000
00b4a59c	add x21,x21,#0xb4d
00b4a5a0	mov w3,#0x160
00b4a5a4	mov x2,x21
00b4a5a8	bl 0x00c345e0
00b4a5ac	ldp x0,x1,[x19, #0x30]
00b4a5b0	mov w3,#0x161
00b4a5b4	mov x2,x21
00b4a5b8	bl 0x00c345e0
00b4a5bc	ldr x0,[x19, #0x40]
00b4a5c0	ldr x1,[x19, #0x60]
00b4a5c4	mov w3,#0x162
00b4a5c8	mov x2,x21
00b4a5cc	bl 0x00c345e0
00b4a5d0	ldr x0,[x19, #0x48]
00b4a5d4	ldr x1,[x19, #0x68]
00b4a5d8	mov w3,#0x163
00b4a5dc	mov x2,x21
00b4a5e0	bl 0x00c345e0
00b4a5e4	ldr x0,[x19, #0x50]
00b4a5e8	ldr x1,[x19, #0x70]
00b4a5ec	mov w3,#0x164
00b4a5f0	mov x2,x21
00b4a5f4	bl 0x00c345e0
00b4a5f8	ldr x0,[x19, #0x58]
00b4a5fc	ldr x1,[x19, #0x78]
00b4a600	mov w3,#0x165
00b4a604	mov x2,x21
00b4a608	bl 0x00c345e0
00b4a60c	mov w2,#0x98
00b4a610	mov x0,x20
00b4a614	mov w1,wzr
00b4a618	bl 0x00c301c0
00b4a61c	mov w8,#0x1
00b4a620	str x22,[x19]
00b4a624	str w8,[x19, #0x98]
00b4a628	ldp x29,x30,[sp, #0x20]
00b4a62c	ldp x20,x19,[sp, #0x10]
00b4a630	ldp x22,x21,[sp], #0x30
00b4a634	ret
