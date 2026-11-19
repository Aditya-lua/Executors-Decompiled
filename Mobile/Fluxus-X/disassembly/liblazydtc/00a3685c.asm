; ossl_ecdsa_simple_verify_sig @ 00a3685c
00a3685c	sub sp,sp,#0x70
00a36860	stp x28,x27,[sp, #0x10]
00a36864	stp x26,x25,[sp, #0x20]
00a36868	stp x24,x23,[sp, #0x30]
00a3686c	stp x22,x21,[sp, #0x40]
00a36870	stp x20,x19,[sp, #0x50]
00a36874	stp x29,x30,[sp, #0x60]
00a36878	add x29,sp,#0x60
00a3687c	cbz x3,0x00a369a4
00a36880	mov x28,x0
00a36884	mov x0,x3
00a36888	mov x19,x3
00a3688c	mov x20,x2
00a36890	mov w27,w1
00a36894	bl 0x00c36880
00a36898	cbz x0,0x00a369a4
00a3689c	mov x21,x0
00a368a0	mov x0,x19
00a368a4	bl 0x00c3a7e0
00a368a8	cbz x20,0x00a369a4
00a368ac	mov x23,x0
00a368b0	cbz x0,0x00a369a4
00a368b4	mov x0,x19
00a368b8	bl 0x00c3af50
00a368bc	cbz w0,0x00a369f8
00a368c0	ldr x0,[x19, #0x58]
00a368c4	bl 0x00c38a60
00a368c8	cbz x0,0x00a36a20
00a368cc	mov x19,x0
00a368d0	bl 0x00c38a90
00a368d4	mov x0,x19
00a368d8	bl 0x00c38a40
00a368dc	mov x25,x0
00a368e0	mov x0,x19
00a368e4	bl 0x00c38a40
00a368e8	mov x26,x0
00a368ec	mov x0,x19
00a368f0	bl 0x00c38a40
00a368f4	mov x22,x0
00a368f8	mov x0,x19
00a368fc	bl 0x00c38a40
00a36900	cbz x0,0x00a36a4c
00a36904	mov x24,x0
00a36908	mov x0,x21
00a3690c	str x25,[sp, #0x8]
00a36910	bl 0x00c3aa40
00a36914	cbz x0,0x00a36a78
00a36918	mov x25,x0
00a3691c	ldr x0,[x20]
00a36920	bl 0x00c369b0
00a36924	cbnz w0,0x00a3696c
00a36928	ldr x0,[x20]
00a3692c	bl 0x00c37f40
00a36930	cbnz w0,0x00a3696c
00a36934	ldr x0,[x20]
00a36938	mov x1,x25
00a3693c	bl 0x00c369c0
00a36940	tbz w0,#0x1f,0x00a3696c
00a36944	ldr x0,[x20, #0x8]
00a36948	bl 0x00c369b0
00a3694c	cbnz w0,0x00a3696c
00a36950	ldr x0,[x20, #0x8]
00a36954	bl 0x00c37f40
00a36958	cbnz w0,0x00a3696c
00a3695c	ldr x0,[x20, #0x8]
00a36960	mov x1,x25
00a36964	bl 0x00c369c0
00a36968	tbnz w0,#0x1f,0x00a36ad0
00a3696c	bl 0x00c342a0
00a36970	adrp x0,0x2c9000
00a36974	adrp x2,0x2c1000
00a36978	add x0,x0,#0x7a8
00a3697c	add x2,x2,#0xb49
00a36980	mov w1,#0x1a9
00a36984	bl 0x00c342b0
00a36988	mov w0,#0x10
00a3698c	mov w1,#0x9c
00a36990	mov x2,xzr
00a36994	bl 0x00c342c0
00a36998	mov w20,wzr
00a3699c	mov x22,xzr
00a369a0	b 0x00a36ab4
00a369a4	bl 0x00c342a0
00a369a8	adrp x0,0x2c9000
00a369ac	adrp x2,0x2c1000
00a369b0	add x0,x0,#0x7a8
00a369b4	add x2,x2,#0xb49
00a369b8	mov w1,#0x188
00a369bc	bl 0x00c342b0
00a369c0	mov w0,#0x10
00a369c4	orr w1,wzr,#0x7c
00a369c8	mov x2,xzr
00a369cc	bl 0x00c342c0
00a369d0	mov w20,#0xffffffff
00a369d4	mov w0,w20
00a369d8	ldp x29,x30,[sp, #0x60]
00a369dc	ldp x20,x19,[sp, #0x50]
00a369e0	ldp x22,x21,[sp, #0x40]
00a369e4	ldp x24,x23,[sp, #0x30]
00a369e8	ldp x26,x25,[sp, #0x20]
00a369ec	ldp x28,x27,[sp, #0x10]
00a369f0	add sp,sp,#0x70
00a369f4	ret
00a369f8	bl 0x00c342a0
00a369fc	adrp x0,0x2c9000
00a36a00	adrp x2,0x2c1000
00a36a04	add x0,x0,#0x7a8
00a36a08	add x2,x2,#0xb49
00a36a0c	mov w1,#0x18d
00a36a10	bl 0x00c342b0
00a36a14	mov w0,#0x10
00a36a18	mov w1,#0x9f
00a36a1c	b 0x00a369c8
00a36a20	bl 0x00c342a0
00a36a24	adrp x0,0x2c9000
00a36a28	adrp x2,0x2c1000
00a36a2c	add x0,x0,#0x7a8
00a36a30	add x2,x2,#0xb49
00a36a34	mov w1,#0x193
00a36a38	bl 0x00c342b0
00a36a3c	mov w1,#0x100
00a36a40	mov w0,#0x10
00a36a44	movk w1,#0xc, LSL #16
00a36a48	b 0x00a369c8
00a36a4c	bl 0x00c342a0
00a36a50	adrp x0,0x2c9000
00a36a54	adrp x2,0x2c1000
00a36a58	add x0,x0,#0x7a8
00a36a5c	add x2,x2,#0xb49
00a36a60	mov w1,#0x19c
00a36a64	bl 0x00c342b0
00a36a68	mov w1,#0x3
00a36a6c	mov w0,#0x10
00a36a70	movk w1,#0x8, LSL #16
00a36a74	b 0x00a36aa4
00a36a78	bl 0x00c342a0
00a36a7c	adrp x0,0x2c9000
00a36a80	adrp x2,0x2c1000
00a36a84	add x0,x0,#0x7a8
00a36a88	add x2,x2,#0xb49
00a36a8c	mov w1,#0x1a2
00a36a90	bl 0x00c342b0
00a36a94	mov w8,#0x3
00a36a98	movk w8,#0x8, LSL #16
00a36a9c	add w1,w8,#0xd
00a36aa0	mov w0,#0x10
00a36aa4	mov x2,xzr
00a36aa8	bl 0x00c342c0
00a36aac	mov x22,xzr
00a36ab0	mov w20,#0xffffffff
00a36ab4	mov x0,x19
00a36ab8	bl 0x00c38a20
00a36abc	mov x0,x19
00a36ac0	bl 0x00c38a30
00a36ac4	mov x0,x22
00a36ac8	bl 0x00c3ab60
00a36acc	b 0x00a369d4
00a36ad0	ldr x2,[x20, #0x8]
00a36ad4	mov x0,x21
00a36ad8	mov x1,x26
00a36adc	mov x3,x19
00a36ae0	bl 0x00c3b0e0
00a36ae4	cbz w0,0x00a36c10
00a36ae8	mov x0,x25
00a36aec	bl 0x00c322f0
00a36af0	lsl w8,w27,#0x3
00a36af4	cmp w8,w0
00a36af8	str w0,[sp, #0x4]
00a36afc	b.le 0x00a36b18
00a36b00	ldr w9,[sp, #0x4]
00a36b04	add w8,w9,#0x7
00a36b08	add w9,w9,#0xe
00a36b0c	cmp w8,#0x0
00a36b10	csel w8,w9,w8,lt
00a36b14	asr w27,w8,#0x3
00a36b18	mov x0,x28
00a36b1c	mov w1,w27
00a36b20	mov x2,x22
00a36b24	bl 0x00c36970
00a36b28	cbz x0,0x00a36c2c
00a36b2c	ldr w9,[sp, #0x4]
00a36b30	lsl w8,w27,#0x3
00a36b34	cmp w8,w9
00a36b38	b.le 0x00a36b5c
00a36b3c	ldr w8,[sp, #0x4]
00a36b40	mov w9,#0x8
00a36b44	mov x0,x22
00a36b48	mov x1,x22
00a36b4c	and w8,w8,#0x7
00a36b50	sub w2,w9,w8
00a36b54	bl 0x00c39070
00a36b58	cbz w0,0x00a36c80
00a36b5c	ldr x0,[sp, #0x8]
00a36b60	mov x1,x22
00a36b64	mov x2,x26
00a36b68	mov x3,x25
00a36b6c	mov x4,x19
00a36b70	bl 0x00c38ef0
00a36b74	cbz w0,0x00a36c48
00a36b78	ldr x1,[x20]
00a36b7c	mov x0,x26
00a36b80	mov x2,x26
00a36b84	mov x3,x25
00a36b88	mov x4,x19
00a36b8c	bl 0x00c38ef0
00a36b90	cbz w0,0x00a36c64
00a36b94	mov x0,x21
00a36b98	bl 0x00c3ab70
00a36b9c	mov x22,x0
00a36ba0	cbz x0,0x00a36c9c
00a36ba4	ldr x2,[sp, #0x8]
00a36ba8	mov x0,x21
00a36bac	mov x1,x22
00a36bb0	mov x3,x23
00a36bb4	mov x4,x26
00a36bb8	mov x5,x19
00a36bbc	bl 0x00c3ae30
00a36bc0	cbz w0,0x00a36cc8
00a36bc4	mov x0,x21
00a36bc8	mov x1,x22
00a36bcc	mov x2,x24
00a36bd0	mov x3,xzr
00a36bd4	mov x4,x19
00a36bd8	bl 0x00c3ae70
00a36bdc	cbz w0,0x00a36ce4
00a36be0	ldr x0,[sp, #0x8]
00a36be4	mov x1,x24
00a36be8	mov x2,x25
00a36bec	mov x3,x19
00a36bf0	bl 0x00c38f30
00a36bf4	cbz w0,0x00a36d14
00a36bf8	ldr x1,[x20]
00a36bfc	ldr x0,[sp, #0x8]
00a36c00	bl 0x00c369c0
00a36c04	cmp w0,#0x0
00a36c08	cset w20,eq
00a36c0c	b 0x00a36ab4
00a36c10	bl 0x00c342a0
00a36c14	adrp x0,0x2c9000
00a36c18	adrp x2,0x2c1000
00a36c1c	add x0,x0,#0x7a8
00a36c20	add x2,x2,#0xb49
00a36c24	mov w1,#0x1af
00a36c28	b 0x00a36a64
00a36c2c	bl 0x00c342a0
00a36c30	adrp x0,0x2c9000
00a36c34	adrp x2,0x2c1000
00a36c38	add x0,x0,#0x7a8
00a36c3c	add x2,x2,#0xb49
00a36c40	mov w1,#0x1ba
00a36c44	b 0x00a36a64
00a36c48	bl 0x00c342a0
00a36c4c	adrp x0,0x2c9000
00a36c50	adrp x2,0x2c1000
00a36c54	add x0,x0,#0x7a8
00a36c58	add x2,x2,#0xb49
00a36c5c	mov w1,#0x1c4
00a36c60	b 0x00a36a64
00a36c64	bl 0x00c342a0
00a36c68	adrp x0,0x2c9000
00a36c6c	adrp x2,0x2c1000
00a36c70	add x0,x0,#0x7a8
00a36c74	add x2,x2,#0xb49
00a36c78	mov w1,#0x1c9
00a36c7c	b 0x00a36a64
00a36c80	bl 0x00c342a0
00a36c84	adrp x0,0x2c9000
00a36c88	adrp x2,0x2c1000
00a36c8c	add x0,x0,#0x7a8
00a36c90	add x2,x2,#0xb49
00a36c94	mov w1,#0x1bf
00a36c98	b 0x00a36a64
00a36c9c	bl 0x00c342a0
00a36ca0	adrp x0,0x2c9000
00a36ca4	adrp x2,0x2c1000
00a36ca8	add x0,x0,#0x7a8
00a36cac	add x2,x2,#0xb49
00a36cb0	mov w1,#0x1ce
00a36cb4	bl 0x00c342b0
00a36cb8	mov w1,#0x100
00a36cbc	mov w0,#0x10
00a36cc0	movk w1,#0xc, LSL #16
00a36cc4	b 0x00a36d3c
00a36cc8	bl 0x00c342a0
00a36ccc	adrp x0,0x2c9000
00a36cd0	adrp x2,0x2c1000
00a36cd4	add x0,x0,#0x7a8
00a36cd8	add x2,x2,#0xb49
00a36cdc	mov w1,#0x1d2
00a36ce0	b 0x00a36cfc
00a36ce4	bl 0x00c342a0
00a36ce8	adrp x0,0x2c9000
00a36cec	adrp x2,0x2c1000
00a36cf0	add x0,x0,#0x7a8
00a36cf4	add x2,x2,#0xb49
00a36cf8	mov w1,#0x1d7
00a36cfc	bl 0x00c342b0
00a36d00	mov w8,#0x3
00a36d04	movk w8,#0x8, LSL #16
00a36d08	add w1,w8,#0xd
00a36d0c	mov w0,#0x10
00a36d10	b 0x00a36d3c
00a36d14	bl 0x00c342a0
00a36d18	adrp x0,0x2c9000
00a36d1c	adrp x2,0x2c1000
00a36d20	add x0,x0,#0x7a8
00a36d24	add x2,x2,#0xb49
00a36d28	mov w1,#0x1dc
00a36d2c	bl 0x00c342b0
00a36d30	mov w1,#0x3
00a36d34	mov w0,#0x10
00a36d38	movk w1,#0x8, LSL #16
00a36d3c	mov x2,xzr
00a36d40	bl 0x00c342c0
00a36d44	b 0x00a36ab0
