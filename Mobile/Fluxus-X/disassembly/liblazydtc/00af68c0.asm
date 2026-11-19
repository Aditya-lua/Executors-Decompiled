; X509v3_addr_is_canonical @ 00af68c0
00af68c0	sub sp,sp,#0xa0
00af68c4	stp x28,x27,[sp, #0x40]
00af68c8	stp x26,x25,[sp, #0x50]
00af68cc	stp x24,x23,[sp, #0x60]
00af68d0	stp x22,x21,[sp, #0x70]
00af68d4	stp x20,x19,[sp, #0x80]
00af68d8	stp x29,x30,[sp, #0x90]
00af68dc	add x29,sp,#0x90
00af68e0	cbz x0,0x00af6bd4
00af68e4	mov x19,x0
00af68e8	mov w20,#0x1
00af68ec	mov x0,x19
00af68f0	sub w21,w20,#0x1
00af68f4	bl 0x00c325e0
00af68f8	sub w8,w0,#0x1
00af68fc	mov x0,x19
00af6900	cmp w21,w8
00af6904	b.ge 0x00af6978
00af6908	mov w1,w21
00af690c	bl 0x00c32610
00af6910	mov x21,x0
00af6914	mov x0,x19
00af6918	mov w1,w20
00af691c	bl 0x00c32610
00af6920	ldr x9,[x21]
00af6924	ldr w8,[x9]
00af6928	and w10,w8,#0xfffffffe
00af692c	cmp w10,#0x2
00af6930	b.ne 0x00af6970
00af6934	ldr x10,[x0]
00af6938	ldr w11,[x10]
00af693c	and w12,w11,#0xfffffffe
00af6940	cmp w12,#0x2
00af6944	b.ne 0x00af6970
00af6948	ldr x0,[x9, #0x8]
00af694c	ldr x1,[x10, #0x8]
00af6950	subs w21,w8,w11
00af6954	csel w8,w11,w8,gt
00af6958	sxtw x2,w8
00af695c	bl 0x00c300b0
00af6960	cmp w0,#0x0
00af6964	csel w8,w21,w0,eq
00af6968	add w20,w20,#0x1
00af696c	tbnz w8,#0x1f,0x00af68ec
00af6970	mov w0,wzr
00af6974	b 0x00af6bd8
00af6978	bl 0x00c325e0
00af697c	cmp w0,#0x1
00af6980	b.lt 0x00af6bd4
00af6984	mov w20,wzr
00af6988	add x27,sp,#0x10
00af698c	mov w28,#0x10
00af6990	mov x0,x19
00af6994	mov w1,w20
00af6998	bl 0x00c32610
00af699c	cbz x0,0x00af6bd8
00af69a0	ldr x8,[x0]
00af69a4	cbz x8,0x00af6bb4
00af69a8	ldr x9,[x8, #0x8]
00af69ac	cbz x9,0x00af6bc4
00af69b0	ldr w10,[x8]
00af69b4	mov w21,wzr
00af69b8	cmp w10,#0x2
00af69bc	b.lt 0x00af6bb8
00af69c0	ldrb w10,[x9]
00af69c4	ldrb w9,[x9, #0x1]
00af69c8	bfm w9,w10,#0x18,#0x7
00af69cc	cmp w9,#0x1
00af69d0	cset w10,eq
00af69d4	lsl w10,w10,#0x2
00af69d8	cmp w9,#0x2
00af69dc	csel w21,w28,w10,eq
00af69e0	ldr x9,[x0, #0x8]
00af69e4	cbz x9,0x00af6970
00af69e8	ldr w10,[x9]
00af69ec	cbz w10,0x00af6b98
00af69f0	cmp w10,#0x1
00af69f4	b.ne 0x00af6970
00af69f8	ldr w8,[x8]
00af69fc	and w8,w8,#0xfffffffe
00af6a00	cmp w8,#0x2
00af6a04	b.ne 0x00af6970
00af6a08	ldr x22,[x9, #0x8]
00af6a0c	mov x0,x22
00af6a10	bl 0x00c325e0
00af6a14	cbz w0,0x00af6bd8
00af6a18	mov x0,x22
00af6a1c	bl 0x00c325e0
00af6a20	cmp w0,#0x2
00af6a24	b.lt 0x00af6b34
00af6a28	mov w23,wzr
00af6a2c	sxtw x24,w21
00af6a30	mov x0,x22
00af6a34	mov w1,w23
00af6a38	bl 0x00c32610
00af6a3c	add w23,w23,#0x1
00af6a40	mov x25,x0
00af6a44	mov x0,x22
00af6a48	mov w1,w23
00af6a4c	bl 0x00c32610
00af6a50	mov x26,x0
00af6a54	add x1,sp,#0x30
00af6a58	add x2,sp,#0x20
00af6a5c	mov x0,x25
00af6a60	mov w3,w21
00af6a64	bl 0x00af66d8
00af6a68	cbz w0,0x00af6bd8
00af6a6c	add x1,sp,#0x10
00af6a70	mov x2,sp
00af6a74	mov x0,x26
00af6a78	mov w3,w21
00af6a7c	bl 0x00af66d8
00af6a80	cbz w0,0x00af6bd8
00af6a84	add x0,sp,#0x30
00af6a88	add x1,sp,#0x10
00af6a8c	mov x2,x24
00af6a90	bl 0x00c300b0
00af6a94	tbz w0,#0x1f,0x00af6970
00af6a98	add x0,sp,#0x30
00af6a9c	add x1,sp,#0x20
00af6aa0	mov x2,x24
00af6aa4	bl 0x00c300b0
00af6aa8	cmp w0,#0x0
00af6aac	b.gt 0x00af6970
00af6ab0	add x0,sp,#0x10
00af6ab4	mov x1,sp
00af6ab8	mov x2,x24
00af6abc	bl 0x00c300b0
00af6ac0	cmp w0,#0x0
00af6ac4	b.gt 0x00af6970
00af6ac8	mov x8,x24
00af6acc	subs x9,x8,#0x1
00af6ad0	b.lt 0x00af6aec
00af6ad4	add x8,x27,x8
00af6ad8	ldurb w10,[x8, #-0x1]
00af6adc	sub w11,w10,#0x1
00af6ae0	sturb w11,[x8, #-0x1]
00af6ae4	mov x8,x9
00af6ae8	cbz w10,0x00af6acc
00af6aec	add x0,sp,#0x20
00af6af0	add x1,sp,#0x10
00af6af4	mov x2,x24
00af6af8	bl 0x00c300b0
00af6afc	tbz w0,#0x1f,0x00af6970
00af6b00	ldr w8,[x25]
00af6b04	cmp w8,#0x1
00af6b08	b.ne 0x00af6b20
00af6b0c	add x0,sp,#0x30
00af6b10	add x1,sp,#0x20
00af6b14	mov w2,w21
00af6b18	bl 0x00af6c48
00af6b1c	tbz w0,#0x1f,0x00af6970
00af6b20	mov x0,x22
00af6b24	bl 0x00c325e0
00af6b28	sub w8,w0,#0x1
00af6b2c	cmp w23,w8
00af6b30	b.lt 0x00af6a30
00af6b34	mov x0,x22
00af6b38	bl 0x00c325e0
00af6b3c	sub w1,w0,#0x1
00af6b40	mov x0,x22
00af6b44	bl 0x00c32610
00af6b48	cbz x0,0x00af6b98
00af6b4c	ldr w8,[x0]
00af6b50	cmp w8,#0x1
00af6b54	b.ne 0x00af6b98
00af6b58	add x1,sp,#0x30
00af6b5c	add x2,sp,#0x20
00af6b60	mov w3,w21
00af6b64	bl 0x00af66d8
00af6b68	cbz w0,0x00af6bd8
00af6b6c	sxtw x2,w21
00af6b70	add x0,sp,#0x30
00af6b74	add x1,sp,#0x20
00af6b78	bl 0x00c300b0
00af6b7c	cmp w0,#0x0
00af6b80	b.gt 0x00af6970
00af6b84	add x0,sp,#0x30
00af6b88	add x1,sp,#0x20
00af6b8c	mov w2,w21
00af6b90	bl 0x00af6c48
00af6b94	tbz w0,#0x1f,0x00af6970
00af6b98	mov x0,x19
00af6b9c	add w20,w20,#0x1
00af6ba0	bl 0x00c325e0
00af6ba4	cmp w20,w0
00af6ba8	mov w0,#0x1
00af6bac	b.lt 0x00af6990
00af6bb0	b 0x00af6bd8
00af6bb4	mov w21,wzr
00af6bb8	ldr x9,[x0, #0x8]
00af6bbc	cbnz x9,0x00af69e8
00af6bc0	b 0x00af6970
00af6bc4	mov w21,wzr
00af6bc8	ldr x9,[x0, #0x8]
00af6bcc	cbnz x9,0x00af69e8
00af6bd0	b 0x00af6970
00af6bd4	mov w0,#0x1
00af6bd8	ldp x29,x30,[sp, #0x90]
00af6bdc	ldp x20,x19,[sp, #0x80]
00af6be0	ldp x22,x21,[sp, #0x70]
00af6be4	ldp x24,x23,[sp, #0x60]
00af6be8	ldp x26,x25,[sp, #0x50]
00af6bec	ldp x28,x27,[sp, #0x40]
00af6bf0	add sp,sp,#0xa0
00af6bf4	ret
