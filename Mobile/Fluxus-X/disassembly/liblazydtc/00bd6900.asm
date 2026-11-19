; FUN_00bd6900 @ 00bd6900
00bd6900	paciasp
00bd6904	sub sp,sp,#0x60
00bd6908	stp x29,x30,[sp, #0x20]
00bd690c	stp x24,x23,[sp, #0x30]
00bd6910	stp x22,x21,[sp, #0x40]
00bd6914	stp x20,x19,[sp, #0x50]
00bd6918	add x29,sp,#0x20
00bd691c	mov x20,x1
00bd6920	mov x19,x0
00bd6924	add x0,sp,#0x8
00bd6928	mov x1,x19
00bd692c	bl 0x00c44040
00bd6930	ldrb w8,[sp, #0x8]
00bd6934	cmp w8,#0x1
00bd6938	b.ne 0x00bd6a08
00bd693c	ldr x8,[x19]
00bd6940	ldur x9,[x8, #-0x18]
00bd6944	sub x8,x29,#0x8
00bd6948	add x0,x19,x9
00bd694c	bl 0x00c30070
00bd6950	adrp x1,0xcb5000
00bd6954	sub x0,x29,#0x8
00bd6958	ldr x1,[x1, #0xbb0]
00bd695c	bl 0x00c30080
00bd6960	mov x21,x0
00bd6964	sub x0,x29,#0x8
00bd6968	bl 0x00c30090
00bd696c	ldr x8,[x19]
00bd6970	ldur x8,[x8, #-0x18]
00bd6974	add x2,x19,x8
00bd6978	ldr w3,[x2, #0x90]
00bd697c	ldr x22,[x2, #0x28]
00bd6980	cmn w3,#0x1
00bd6984	b.ne 0x00bd69d0
00bd6988	sub x8,x29,#0x8
00bd698c	mov x0,x2
00bd6990	mov x24,x2
00bd6994	bl 0x00c30070
00bd6998	adrp x1,0xcb5000
00bd699c	sub x0,x29,#0x8
00bd69a0	ldr x1,[x1, #0xb98]
00bd69a4	bl 0x00c30080
00bd69a8	ldr x8,[x0]
00bd69ac	ldr x8,[x8, #0x58]
00bd69b0	mov w1,#0x20
00bd69b4	blr x8
00bd69b8	mov w23,w0
00bd69bc	sub x0,x29,#0x8
00bd69c0	bl 0x00c30090
00bd69c4	mov x2,x24
00bd69c8	mov w3,w23
00bd69cc	str w23,[x24, #0x90]
00bd69d0	ldr x8,[x21]
00bd69d4	ldr x8,[x8, #0x38]
00bd69d8	mov x0,x21
00bd69dc	mov x1,x22
00bd69e0	mov x4,x20
00bd69e4	blr x8
00bd69e8	cbnz x0,0x00bd6a08
00bd69ec	ldr x8,[x19]
00bd69f0	mov w9,#0x5
00bd69f4	ldur x8,[x8, #-0x18]
00bd69f8	add x0,x19,x8
00bd69fc	ldr w8,[x0, #0x20]
00bd6a00	orr w1,w8,w9
00bd6a04	bl 0x00c30130
00bd6a08	add x0,sp,#0x8
00bd6a0c	bl 0x00c44050
00bd6a10	mov x0,x19
00bd6a14	ldp x20,x19,[sp, #0x50]
00bd6a18	ldp x22,x21,[sp, #0x40]
00bd6a1c	ldp x24,x23,[sp, #0x30]
00bd6a20	ldp x29,x30,[sp, #0x20]
00bd6a24	add sp,sp,#0x60
00bd6a28	autiasp
00bd6a2c	ret
