; FUN_00bd65c8 @ 00bd65c8
00bd65c8	paciasp
00bd65cc	sub sp,sp,#0x60
00bd65d0	stp x29,x30,[sp, #0x20]
00bd65d4	stp x24,x23,[sp, #0x30]
00bd65d8	stp x22,x21,[sp, #0x40]
00bd65dc	stp x20,x19,[sp, #0x50]
00bd65e0	add x29,sp,#0x20
00bd65e4	mov x20,x1
00bd65e8	mov x19,x0
00bd65ec	add x0,sp,#0x8
00bd65f0	mov x1,x19
00bd65f4	bl 0x00c44040
00bd65f8	ldrb w8,[sp, #0x8]
00bd65fc	cmp w8,#0x1
00bd6600	b.ne 0x00bd66d0
00bd6604	ldr x8,[x19]
00bd6608	ldur x9,[x8, #-0x18]
00bd660c	sub x8,x29,#0x8
00bd6610	add x0,x19,x9
00bd6614	bl 0x00c30070
00bd6618	adrp x1,0xcb5000
00bd661c	sub x0,x29,#0x8
00bd6620	ldr x1,[x1, #0xbb0]
00bd6624	bl 0x00c30080
00bd6628	mov x21,x0
00bd662c	sub x0,x29,#0x8
00bd6630	bl 0x00c30090
00bd6634	ldr x8,[x19]
00bd6638	ldur x8,[x8, #-0x18]
00bd663c	add x2,x19,x8
00bd6640	ldr w3,[x2, #0x90]
00bd6644	ldr x22,[x2, #0x28]
00bd6648	cmn w3,#0x1
00bd664c	b.ne 0x00bd6698
00bd6650	sub x8,x29,#0x8
00bd6654	mov x0,x2
00bd6658	mov x24,x2
00bd665c	bl 0x00c30070
00bd6660	adrp x1,0xcb5000
00bd6664	sub x0,x29,#0x8
00bd6668	ldr x1,[x1, #0xb98]
00bd666c	bl 0x00c30080
00bd6670	ldr x8,[x0]
00bd6674	ldr x8,[x8, #0x58]
00bd6678	mov w1,#0x20
00bd667c	blr x8
00bd6680	mov w23,w0
00bd6684	sub x0,x29,#0x8
00bd6688	bl 0x00c30090
00bd668c	mov x2,x24
00bd6690	mov w3,w23
00bd6694	str w23,[x24, #0x90]
00bd6698	ldr x8,[x21]
00bd669c	ldr x8,[x8, #0x30]
00bd66a0	mov x0,x21
00bd66a4	mov x1,x22
00bd66a8	mov x4,x20
00bd66ac	blr x8
00bd66b0	cbnz x0,0x00bd66d0
00bd66b4	ldr x8,[x19]
00bd66b8	mov w9,#0x5
00bd66bc	ldur x8,[x8, #-0x18]
00bd66c0	add x0,x19,x8
00bd66c4	ldr w8,[x0, #0x20]
00bd66c8	orr w1,w8,w9
00bd66cc	bl 0x00c30130
00bd66d0	add x0,sp,#0x8
00bd66d4	bl 0x00c44050
00bd66d8	mov x0,x19
00bd66dc	ldp x20,x19,[sp, #0x50]
00bd66e0	ldp x22,x21,[sp, #0x40]
00bd66e4	ldp x24,x23,[sp, #0x30]
00bd66e8	ldp x29,x30,[sp, #0x20]
00bd66ec	add sp,sp,#0x60
00bd66f0	autiasp
00bd66f4	ret
