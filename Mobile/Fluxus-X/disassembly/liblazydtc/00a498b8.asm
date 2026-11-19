; ossl_curve448_base_double_scalarmul_non_secret @ 00a498b8
00a498b8	stp x28,x27,[sp, #-0x60]!
00a498bc	stp x26,x25,[sp, #0x10]
00a498c0	stp x24,x23,[sp, #0x20]
00a498c4	stp x22,x21,[sp, #0x30]
00a498c8	stp x20,x19,[sp, #0x40]
00a498cc	stp x29,x30,[sp, #0x50]
00a498d0	add x29,sp,#0x50
00a498d4	sub sp,sp,#0x1, LSL #12
00a498d8	sub sp,sp,#0x50
00a498dc	mov x21,x2
00a498e0	mov x19,x0
00a498e4	add x0,sp,#0x808
00a498e8	mov w2,#0x5
00a498ec	mov x20,x3
00a498f0	bl 0x00a49f0c
00a498f4	add x0,sp,#0xa70
00a498f8	orr w2,wzr,#0x3
00a498fc	mov x1,x20
00a49900	bl 0x00a49f0c
00a49904	add x20,x21,#0x40
00a49908	mov x0,sp
00a4990c	mov x1,x20
00a49910	mov x2,x21
00a49914	mov x26,sp
00a49918	bl 0x00c3a5f0
00a4991c	add x0,x26,#0x40
00a49920	mov x1,x21
00a49924	mov x2,x20
00a49928	bl 0x00c3a590
00a4992c	add x22,x26,#0x80
00a49930	mov w2,#0x3154
00a49934	add x1,x21,#0xc0
00a49938	movk w2,#0x1, LSL #16
00a4993c	mov x0,x22
00a49940	bl 0x00c3a4c0
00a49944	adrp x20,0x760000
00a49948	add x20,x20,#0x980
00a4994c	mov x0,x22
00a49950	mov x1,x20
00a49954	mov x2,x22
00a49958	bl 0x00c3a5f0
00a4995c	add x25,x26,#0xc0
00a49960	add x1,x21,#0x80
00a49964	mov x0,x25
00a49968	mov x2,x1
00a4996c	bl 0x00c3a590
00a49970	add x0,sp,#0xf00
00a49974	mov x1,x21
00a49978	mov w2,wzr
00a4997c	add x24,sp,#0xf00
00a49980	bl 0x00a4761c
00a49984	add x21,x24,#0x40
00a49988	add x0,sp,#0xe00
00a4998c	add x2,sp,#0xf00
00a49990	mov x1,x21
00a49994	add x27,sp,#0xe00
00a49998	bl 0x00c3a5f0
00a4999c	add x0,x27,#0x40
00a499a0	add x1,sp,#0xf00
00a499a4	mov x2,x21
00a499a8	bl 0x00c3a590
00a499ac	add x23,x27,#0x80
00a499b0	add x22,x24,#0xc0
00a499b4	mov w2,#0x3154
00a499b8	movk w2,#0x1, LSL #16
00a499bc	mov x0,x23
00a499c0	mov x1,x22
00a499c4	bl 0x00c3a4c0
00a499c8	mov x0,x23
00a499cc	mov x1,x20
00a499d0	mov x2,x23
00a499d4	bl 0x00c3a5f0
00a499d8	add x23,x27,#0xc0
00a499dc	add x24,x24,#0x80
00a499e0	mov x0,x23
00a499e4	mov x1,x24
00a499e8	mov x2,x24
00a499ec	bl 0x00c3a590
00a499f0	sub x0,x29,#0xa0
00a499f4	mov x1,x24
00a499f8	mov x2,x25
00a499fc	bl 0x00c3a4b0
00a49a00	ldp q1,q0,[x29, #-0x80]
00a49a04	ldp q3,q2,[x29, #-0xa0]
00a49a08	add x0,sp,#0xf00
00a49a0c	mov x1,sp
00a49a10	mov w2,wzr
00a49a14	str q0,[sp, #0xfb0]
00a49a18	str q1,[sp, #0xfa0]
00a49a1c	str q2,[sp, #0xf90]
00a49a20	str q3,[sp, #0xf80]
00a49a24	bl 0x00a4812c
00a49a28	add x0,x26,#0x100
00a49a2c	add x2,sp,#0xf00
00a49a30	mov x1,x21
00a49a34	bl 0x00c3a5f0
00a49a38	add x0,x26,#0x140
00a49a3c	add x1,sp,#0xf00
00a49a40	mov x2,x21
00a49a44	bl 0x00c3a590
00a49a48	add x25,x26,#0x180
00a49a4c	mov w2,#0x3154
00a49a50	movk w2,#0x1, LSL #16
00a49a54	mov x0,x25
00a49a58	mov x1,x22
00a49a5c	bl 0x00c3a4c0
00a49a60	mov x0,x25
00a49a64	mov x1,x20
00a49a68	mov x2,x25
00a49a6c	bl 0x00c3a5f0
00a49a70	add x0,x26,#0x1c0
00a49a74	mov x1,x24
00a49a78	mov x2,x24
00a49a7c	bl 0x00c3a590
00a49a80	mov x27,#-0x600
00a49a84	sub x0,x29,#0xa0
00a49a88	mov x1,x24
00a49a8c	mov x2,x23
00a49a90	bl 0x00c3a4b0
00a49a94	ldp q0,q1,[x29, #-0x80]
00a49a98	ldp q2,q3,[x29, #-0xa0]
00a49a9c	add x0,sp,#0xf00
00a49aa0	add x1,sp,#0xe00
00a49aa4	mov w2,wzr
00a49aa8	stp q0,q1,[x24, #0x20]
00a49aac	stp q2,q3,[x24]
00a49ab0	bl 0x00a4812c
00a49ab4	add x28,x26,x27
00a49ab8	add x0,x28,#0x800
00a49abc	add x2,sp,#0xf00
00a49ac0	mov x1,x21
00a49ac4	bl 0x00c3a5f0
00a49ac8	add x0,x28,#0x840
00a49acc	add x1,sp,#0xf00
00a49ad0	mov x2,x21
00a49ad4	bl 0x00c3a590
00a49ad8	add x25,x28,#0x880
00a49adc	mov w2,#0x3154
00a49ae0	movk w2,#0x1, LSL #16
00a49ae4	mov x0,x25
00a49ae8	mov x1,x22
00a49aec	bl 0x00c3a4c0
00a49af0	mov x0,x25
00a49af4	mov x1,x20
00a49af8	mov x2,x25
00a49afc	bl 0x00c3a5f0
00a49b00	add x0,x28,#0x8c0
00a49b04	mov x1,x24
00a49b08	mov x2,x24
00a49b0c	bl 0x00c3a590
00a49b10	adds x27,x27,#0x100
00a49b14	b.ne 0x00a49a84
00a49b18	add x0,sp,#0xf00
00a49b1c	mov w1,#0x100
00a49b20	bl 0x00c34750
00a49b24	add x0,sp,#0xe00
00a49b28	mov w1,#0x100
00a49b2c	bl 0x00c34750
00a49b30	ldr w20,[sp, #0xa70]
00a49b34	tbnz w20,#0x1f,0x00a49bd0
00a49b38	ldr w23,[sp, #0x808]
00a49b3c	cmp w20,w23
00a49b40	b.le 0x00a49be8
00a49b44	ldr w8,[sp, #0xa74]
00a49b48	mov x9,sp
00a49b4c	sub x0,x29,#0xa0
00a49b50	sbfx x8,x8,#0x1,#0x1f
00a49b54	add x21,x9,x8, LSL #0x8
00a49b58	add x22,x21,#0x40
00a49b5c	mov x1,x22
00a49b60	mov x2,x21
00a49b64	bl 0x00c3a590
00a49b68	add x23,x19,#0x40
00a49b6c	mov x0,x23
00a49b70	mov x1,x22
00a49b74	mov x2,x21
00a49b78	bl 0x00c3a5f0
00a49b7c	add x0,x19,#0xc0
00a49b80	sub x2,x29,#0xa0
00a49b84	mov x1,x23
00a49b88	bl 0x00c3a4b0
00a49b8c	add x21,x21,#0xc0
00a49b90	mov x0,x19
00a49b94	mov x1,x21
00a49b98	mov x2,x23
00a49b9c	bl 0x00c3a4b0
00a49ba0	sub x2,x29,#0xa0
00a49ba4	mov x0,x23
00a49ba8	mov x1,x21
00a49bac	bl 0x00c3a4b0
00a49bb0	add x0,x19,#0x80
00a49bb4	mov x1,x21
00a49bb8	bl 0x00c3a4d0
00a49bbc	mov w25,wzr
00a49bc0	mov w24,#0x1
00a49bc4	subs w20,w20,#0x1
00a49bc8	b.ge 0x00a49d20
00a49bcc	b 0x00a49ec4
00a49bd0	adrp x1,0xcb5000
00a49bd4	ldr x1,[x1, #0x520]
00a49bd8	mov w2,#0x100
00a49bdc	mov x0,x19
00a49be0	bl 0x00c2ffd0
00a49be4	b 0x00a49ee8
00a49be8	b.ne 0x00a49ca0
00a49bec	ldr w8,[sp, #0xa74]
00a49bf0	mov x9,sp
00a49bf4	sub x0,x29,#0xa0
00a49bf8	sbfx x8,x8,#0x1,#0x1f
00a49bfc	add x21,x9,x8, LSL #0x8
00a49c00	add x22,x21,#0x40
00a49c04	mov x1,x22
00a49c08	mov x2,x21
00a49c0c	bl 0x00c3a590
00a49c10	add x23,x19,#0x40
00a49c14	mov x0,x23
00a49c18	mov x1,x22
00a49c1c	mov x2,x21
00a49c20	bl 0x00c3a5f0
00a49c24	add x0,x19,#0xc0
00a49c28	sub x2,x29,#0xa0
00a49c2c	mov x1,x23
00a49c30	bl 0x00c3a4b0
00a49c34	add x21,x21,#0xc0
00a49c38	mov x0,x19
00a49c3c	mov x1,x21
00a49c40	mov x2,x23
00a49c44	bl 0x00c3a4b0
00a49c48	sub x2,x29,#0xa0
00a49c4c	mov x0,x23
00a49c50	mov x1,x21
00a49c54	bl 0x00c3a4b0
00a49c58	add x0,x19,#0x80
00a49c5c	mov x1,x21
00a49c60	bl 0x00c3a4d0
00a49c64	adrp x9,0xcb5000
00a49c68	ldr w8,[sp, #0x80c]
00a49c6c	ldr x9,[x9, #0x530]
00a49c70	orr w10,wzr,#0xc0
00a49c74	mov x0,x19
00a49c78	asr w8,w8,#0x1
00a49c7c	ldr x9,[x9]
00a49c80	mov w2,w20
00a49c84	smaddl x1,w8,w10,x9
00a49c88	bl 0x00a4812c
00a49c8c	mov w24,#0x1
00a49c90	mov w25,#0x1
00a49c94	subs w20,w20,#0x1
00a49c98	b.ge 0x00a49d20
00a49c9c	b 0x00a49ec4
00a49ca0	adrp x9,0xcb5000
00a49ca4	ldr w8,[sp, #0x80c]
00a49ca8	ldr x9,[x9, #0x530]
00a49cac	orr w10,wzr,#0xc0
00a49cb0	add x20,x19,#0x40
00a49cb4	asr w8,w8,#0x1
00a49cb8	ldr x9,[x9]
00a49cbc	mov x0,x20
00a49cc0	smaddl x21,w8,w10,x9
00a49cc4	add x22,x21,#0x40
00a49cc8	mov x1,x22
00a49ccc	mov x2,x21
00a49cd0	bl 0x00c3a590
00a49cd4	mov x0,x19
00a49cd8	mov x1,x22
00a49cdc	mov x2,x21
00a49ce0	bl 0x00c3a5f0
00a49ce4	add x0,x19,#0xc0
00a49ce8	mov x1,x20
00a49cec	mov x2,x19
00a49cf0	bl 0x00c3a4b0
00a49cf4	adrp x8,0x760000
00a49cf8	add x8,x8,#0xa00
00a49cfc	ldp q1,q0,[x8, #0x20]
00a49d00	ldp q3,q2,[x8]
00a49d04	mov w24,wzr
00a49d08	mov w25,#0x1
00a49d0c	mov w20,w23
00a49d10	stp q1,q0,[x19, #0xa0]
00a49d14	stp q3,q2,[x19, #0x80]
00a49d18	subs w20,w20,#0x1
00a49d1c	b.lt 0x00a49ec4
00a49d20	add x21,x19,#0x80
00a49d24	add x26,sp,#0xa70
00a49d28	add x27,sp,#0x808
00a49d2c	sbfiz x8,x24,#0x3,#0x20
00a49d30	sbfiz x9,x25,#0x3,#0x20
00a49d34	ldr w22,[x26, x8#0x0]
00a49d38	ldr w28,[x27, x9#0x0]
00a49d3c	cbz w20,0x00a49d58
00a49d40	cmp w20,w28
00a49d44	cset w8,ne
00a49d48	cmp w20,w22
00a49d4c	cset w9,ne
00a49d50	and w2,w9,w8
00a49d54	b 0x00a49d5c
00a49d58	mov w2,wzr
00a49d5c	mov x0,x19
00a49d60	mov x1,x19
00a49d64	bl 0x00a4761c
00a49d68	cmp w20,w22
00a49d6c	b.ne 0x00a49e50
00a49d70	sxtw x8,w24
00a49d74	add x8,x26,x8, LSL #0x3
00a49d78	ldr w8,[x8, #0x4]
00a49d7c	cmp w8,#0x1
00a49d80	b.lt 0x00a49de8
00a49d84	cmp w20,#0x0
00a49d88	lsr w8,w8,#0x1
00a49d8c	mov x10,sp
00a49d90	cset w9,ne
00a49d94	cmp w20,w28
00a49d98	add x22,x10,x8, LSL #0x8
00a49d9c	cset w8,ne
00a49da0	add x2,x22,#0xc0
00a49da4	sub x0,x29,#0xa0
00a49da8	mov x1,x21
00a49dac	and w23,w9,w8
00a49db0	bl 0x00c3a4b0
00a49db4	ldur q0,[x29, #-0x70]
00a49db8	mov x0,x19
00a49dbc	mov x1,x22
00a49dc0	mov w2,w23
00a49dc4	str q0,[x21, #0x30]
00a49dc8	ldur q0,[x29, #-0x80]
00a49dcc	str q0,[x21, #0x20]
00a49dd0	ldur q0,[x29, #-0x90]
00a49dd4	str q0,[x21, #0x10]
00a49dd8	ldur q0,[x29, #-0xa0]
00a49ddc	str q0,[x21]
00a49de0	bl 0x00a4812c
00a49de4	b 0x00a49e4c
00a49de8	neg w8,w8
00a49dec	cmp w20,#0x0
00a49df0	sbfx x8,x8,#0x1,#0x1f
00a49df4	mov x11,sp
00a49df8	cset w9,ne
00a49dfc	cmp w20,w28
00a49e00	add x22,x11,x8, LSL #0x8
00a49e04	cset w10,ne
00a49e08	add x2,x22,#0xc0
00a49e0c	sub x0,x29,#0xa0
00a49e10	mov x1,x21
00a49e14	and w23,w9,w10
00a49e18	bl 0x00c3a4b0
00a49e1c	ldur q0,[x29, #-0x70]
00a49e20	mov x0,x19
00a49e24	mov x1,x22
00a49e28	mov w2,w23
00a49e2c	str q0,[x21, #0x30]
00a49e30	ldur q0,[x29, #-0x80]
00a49e34	str q0,[x21, #0x20]
00a49e38	ldur q0,[x29, #-0x90]
00a49e3c	str q0,[x21, #0x10]
00a49e40	ldur q0,[x29, #-0xa0]
00a49e44	str q0,[x21]
00a49e48	bl 0x00a4a084
00a49e4c	add w24,w24,#0x1
00a49e50	cmp w20,w28
00a49e54	b.ne 0x00a49eb4
00a49e58	sxtw x8,w25
00a49e5c	add x8,x27,x8, LSL #0x3
00a49e60	ldr w9,[x8, #0x4]
00a49e64	adrp x8,0xcb5000
00a49e68	ldr x8,[x8, #0x530]
00a49e6c	cmp w9,#0x1
00a49e70	ldr x8,[x8]
00a49e74	b.lt 0x00a49e94
00a49e78	lsr w9,w9,#0x1
00a49e7c	orr w10,wzr,#0xc0
00a49e80	umaddl x1,w9,w10,x8
00a49e84	mov x0,x19
00a49e88	mov w2,w20
00a49e8c	bl 0x00a4812c
00a49e90	b 0x00a49eb0
00a49e94	neg w9,w9
00a49e98	asr w9,w9,#0x1
00a49e9c	orr w10,wzr,#0xc0
00a49ea0	smaddl x1,w9,w10,x8
00a49ea4	mov x0,x19
00a49ea8	mov w2,w20
00a49eac	bl 0x00a4a084
00a49eb0	add w25,w25,#0x1
00a49eb4	add w8,w20,#0x1
00a49eb8	sub w20,w20,#0x1
00a49ebc	cmp w8,#0x1
00a49ec0	b.gt 0x00a49d2c
00a49ec4	add x0,sp,#0xa70
00a49ec8	mov w1,#0x390
00a49ecc	bl 0x00c34750
00a49ed0	add x0,sp,#0x808
00a49ed4	mov w1,#0x268
00a49ed8	bl 0x00c34750
00a49edc	mov x0,sp
00a49ee0	mov w1,#0x800
00a49ee4	bl 0x00c34750
00a49ee8	add sp,sp,#0x1, LSL #12
00a49eec	add sp,sp,#0x50
00a49ef0	ldp x29,x30,[sp, #0x50]
00a49ef4	ldp x20,x19,[sp, #0x40]
00a49ef8	ldp x22,x21,[sp, #0x30]
00a49efc	ldp x24,x23,[sp, #0x20]
00a49f00	ldp x26,x25,[sp, #0x10]
00a49f04	ldp x28,x27,[sp], #0x60
00a49f08	ret
