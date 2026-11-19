; FUN_00b49ab4 @ 00b49ab4
00b49ab4	sub sp,sp,#0xc0
00b49ab8	mov w8,#0x40000000
00b49abc	stp x28,x27,[sp, #0x60]
00b49ac0	cmp x2,x8
00b49ac4	mov w28,wzr
00b49ac8	stp x26,x25,[sp, #0x70]
00b49acc	stp x24,x23,[sp, #0x80]
00b49ad0	stp x22,x21,[sp, #0x90]
00b49ad4	stp x20,x19,[sp, #0xa0]
00b49ad8	stp x29,x30,[sp, #0xb0]
00b49adc	add x29,sp,#0xb0
00b49ae0	b.hi 0x00b49c98
00b49ae4	mov w8,#0x40000000
00b49ae8	mov x23,x4
00b49aec	cmp x4,x8
00b49af0	b.hi 0x00b49c98
00b49af4	sub x8,x7,#0x1
00b49af8	mov x27,x7
00b49afc	lsr x8,x8,#0x1e
00b49b00	cbnz x8,0x00b49c98
00b49b04	mov x21,x6
00b49b08	mov w22,w5
00b49b0c	mov x19,x3
00b49b10	mov x25,x2
00b49b14	mov x26,x1
00b49b18	mov x20,x0
00b49b1c	bl 0x00c34c20
00b49b20	mov w24,w0
00b49b24	cmp w0,#0x1
00b49b28	b.lt 0x00b49c44
00b49b2c	str x19,[sp, #0x8]
00b49b30	bl 0x00c31fa0
00b49b34	mov x19,x0
00b49b38	bl 0x00c31fa0
00b49b3c	mov w28,wzr
00b49b40	str x0,[sp, #0x10]
00b49b44	cbz x19,0x00b49c7c
00b49b48	cbz x0,0x00b49c7c
00b49b4c	ldr x28,[sp, #0x10]
00b49b50	mov x1,x20
00b49b54	mov x0,x28
00b49b58	bl 0x00c32430
00b49b5c	cbz w0,0x00b49c78
00b49b60	mov w8,#0x1000000
00b49b64	mov x0,x19
00b49b68	mov x1,x28
00b49b6c	stur w8,[x29, #-0x54]
00b49b70	bl 0x00c34bf0
00b49b74	cbz w0,0x00b49c78
00b49b78	sxtw x8,w24
00b49b7c	mov w24,#0x2
00b49b80	str x8,[sp]
00b49b84	cbnz w22,0x00b49b9c
00b49b88	sub x1,x29,#0x54
00b49b8c	mov w2,#0x4
00b49b90	mov x0,x19
00b49b94	bl 0x00c31f80
00b49b98	cbz w0,0x00b49c78
00b49b9c	mov x0,x19
00b49ba0	mov x1,x26
00b49ba4	mov x2,x25
00b49ba8	bl 0x00c31f80
00b49bac	cbz w0,0x00b49c78
00b49bb0	cbz w22,0x00b49bc8
00b49bb4	sub x1,x29,#0x54
00b49bb8	mov w2,#0x4
00b49bbc	mov x0,x19
00b49bc0	bl 0x00c31f80
00b49bc4	cbz w0,0x00b49c78
00b49bc8	ldr x1,[sp, #0x8]
00b49bcc	mov x0,x19
00b49bd0	mov x2,x23
00b49bd4	bl 0x00c31f80
00b49bd8	cbz w0,0x00b49c78
00b49bdc	ldr x28,[sp]
00b49be0	subs x20,x27,x28
00b49be4	b.cc 0x00b49c4c
00b49be8	mov x0,x19
00b49bec	mov x1,x21
00b49bf0	mov x2,xzr
00b49bf4	bl 0x00c31f60
00b49bf8	cbz w0,0x00b49c78
00b49bfc	cmp x28,x27
00b49c00	b.eq 0x00b49c70
00b49c04	ldr x1,[sp, #0x10]
00b49c08	lsr x8,x24,#0x18
00b49c0c	lsr x9,x24,#0x10
00b49c10	lsr x10,x24,#0x8
00b49c14	mov x0,x19
00b49c18	add x21,x21,x28
00b49c1c	sturb w8,[x29, #-0x54]
00b49c20	sturb w9,[x29, #-0x53]
00b49c24	sturb w10,[x29, #-0x52]
00b49c28	sturb w24,[x29, #-0x51]
00b49c2c	bl 0x00c34bf0
00b49c30	mov w28,wzr
00b49c34	add x24,x24,#0x1
00b49c38	mov x27,x20
00b49c3c	cbnz w0,0x00b49b84
00b49c40	b 0x00b49c7c
00b49c44	mov w28,wzr
00b49c48	b 0x00b49c98
00b49c4c	add x1,sp,#0x1c
00b49c50	mov x0,x19
00b49c54	mov x2,xzr
00b49c58	bl 0x00c31f60
00b49c5c	cbz w0,0x00b49c78
00b49c60	add x1,sp,#0x1c
00b49c64	mov x0,x21
00b49c68	mov x2,x27
00b49c6c	bl 0x00c2ffd0
00b49c70	mov w28,#0x1
00b49c74	b 0x00b49c7c
00b49c78	mov w28,wzr
00b49c7c	mov x0,x19
00b49c80	bl 0x00c31f90
00b49c84	ldr x0,[sp, #0x10]
00b49c88	bl 0x00c31f90
00b49c8c	add x0,sp,#0x1c
00b49c90	mov w1,#0x40
00b49c94	bl 0x00c34750
00b49c98	mov w0,w28
00b49c9c	ldp x29,x30,[sp, #0xb0]
00b49ca0	ldp x20,x19,[sp, #0xa0]
00b49ca4	ldp x22,x21,[sp, #0x90]
00b49ca8	ldp x24,x23,[sp, #0x80]
00b49cac	ldp x26,x25,[sp, #0x70]
00b49cb0	ldp x28,x27,[sp, #0x60]
00b49cb4	add sp,sp,#0xc0
00b49cb8	ret
