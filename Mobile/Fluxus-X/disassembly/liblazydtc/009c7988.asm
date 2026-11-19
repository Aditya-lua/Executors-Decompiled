; tls13_update_key @ 009c7988
009c7988	sub sp,sp,#0xf0
009c798c	str x25,[sp, #0xa0]
009c7990	stp x24,x23,[sp, #0xb0]
009c7994	stp x22,x21,[sp, #0xc0]
009c7998	stp x20,x19,[sp, #0xd0]
009c799c	stp x29,x30,[sp, #0xe0]
009c79a0	add x29,sp,#0xe0
009c79a4	mov w20,w1
009c79a8	mov x19,x0
009c79ac	bl 0x00c34a10
009c79b0	mov x22,x0
009c79b4	bl 0x00c34c20
009c79b8	mov w21,w0
009c79bc	cmp w0,#0x0
009c79c0	b.le 0x009c79f8
009c79c4	ldr w8,[x19, #0x38]
009c79c8	add x9,x19,#0x784
009c79cc	add x10,x19,#0x744
009c79d0	cmp w8,w20
009c79d4	csel x23,x9,x10,eq
009c79d8	cbz w20,0x009c7a34
009c79dc	ldr x24,[x19, #0x878]
009c79e0	mov w8,#0x1
009c79e4	add x0,x19,#0xc58
009c79e8	str w8,[x19, #0x7c]
009c79ec	add x25,x19,#0x880
009c79f0	bl 0x00c34c70
009c79f4	b 0x009c7a44
009c79f8	bl 0x00c342a0
009c79fc	adrp x0,0x2b5000
009c7a00	adrp x2,0x2b3000
009c7a04	add x0,x0,#0x997
009c7a08	add x2,x2,#0xeea
009c7a0c	mov w1,#0x2fb
009c7a10	bl 0x00c342b0
009c7a14	mov w2,#0x103
009c7a18	mov w1,#0x50
009c7a1c	movk w2,#0xc, LSL #16
009c7a20	mov x0,x19
009c7a24	mov x3,xzr
009c7a28	bl 0x00c34410
009c7a2c	mov w19,wzr
009c7a30	b 0x009c7aec
009c7a34	ldr x24,[x19, #0x848]
009c7a38	add x0,x19,#0xc58
009c7a3c	add x25,x19,#0x850
009c7a40	bl 0x00c34c60
009c7a44	ldr x3,[x19, #0x320]
009c7a48	adrp x6,0x74c000
009c7a4c	add x8,sp,#0x60
009c7a50	add x9,sp,#0x20
009c7a54	add x6,x6,#0xe9e
009c7a58	mov w7,#0xb
009c7a5c	mov x0,x19
009c7a60	mov w1,w20
009c7a64	mov x2,x22
009c7a68	mov x4,x23
009c7a6c	mov x5,xzr
009c7a70	stp x25,x24,[sp, #0x10]
009c7a74	stp x9,x8,[sp]
009c7a78	bl 0x009c7704
009c7a7c	cbz w0,0x009c7ad0
009c7a80	sxtw x21,w21
009c7a84	add x1,sp,#0x20
009c7a88	mov x0,x23
009c7a8c	mov x2,x21
009c7a90	bl 0x00c2ffd0
009c7a94	ldr w8,[x19, #0x38]
009c7a98	adrp x9,0x2cd000
009c7a9c	adrp x10,0x29d000
009c7aa0	add x9,x9,#0x704
009c7aa4	add x10,x10,#0xe5d
009c7aa8	cmp w8,w20
009c7aac	csel x1,x10,x9,eq
009c7ab0	add x2,sp,#0x20
009c7ab4	mov x0,x19
009c7ab8	mov x3,x21
009c7abc	bl 0x00c35e00
009c7ac0	cbz w0,0x009c7ad0
009c7ac4	str wzr,[x19, #0x7c]
009c7ac8	mov w19,#0x1
009c7acc	b 0x009c7ad4
009c7ad0	mov w19,wzr
009c7ad4	add x0,sp,#0x60
009c7ad8	mov w1,#0x40
009c7adc	bl 0x00c34750
009c7ae0	add x0,sp,#0x20
009c7ae4	mov w1,#0x40
009c7ae8	bl 0x00c34750
009c7aec	mov w0,w19
009c7af0	ldp x29,x30,[sp, #0xe0]
009c7af4	ldp x20,x19,[sp, #0xd0]
009c7af8	ldp x22,x21,[sp, #0xc0]
009c7afc	ldp x24,x23,[sp, #0xb0]
009c7b00	ldr x25,[sp, #0xa0]
009c7b04	add sp,sp,#0xf0
009c7b08	ret
