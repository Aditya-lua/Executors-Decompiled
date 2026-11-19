; ossl_ec_GF2m_simple_set_compressed_coordinates @ 00a34df8
00a34df8	sub sp,sp,#0x70
00a34dfc	stp x28,x27,[sp, #0x10]
00a34e00	stp x24,x23,[sp, #0x30]
00a34e04	stp x22,x21,[sp, #0x40]
00a34e08	stp x20,x19,[sp, #0x50]
00a34e0c	mov x19,x4
00a34e10	mov w23,w3
00a34e14	mov x21,x2
00a34e18	mov x28,x1
00a34e1c	mov x22,x0
00a34e20	mov x20,xzr
00a34e24	stp x26,x25,[sp, #0x20]
00a34e28	stp x29,x30,[sp, #0x60]
00a34e2c	add x29,sp,#0x60
00a34e30	cbnz x4,0x00a34e44
00a34e34	bl 0x00c38a50
00a34e38	mov x19,x0
00a34e3c	mov x20,x0
00a34e40	cbz x0,0x00a34ee4
00a34e44	mov x0,x19
00a34e48	bl 0x00c38a90
00a34e4c	mov x0,x19
00a34e50	bl 0x00c38a40
00a34e54	mov x27,x0
00a34e58	mov x0,x19
00a34e5c	bl 0x00c38a40
00a34e60	mov x24,x0
00a34e64	mov x0,x19
00a34e68	bl 0x00c38a40
00a34e6c	mov x25,x0
00a34e70	mov x0,x19
00a34e74	bl 0x00c38a40
00a34e78	cbz x0,0x00a35064
00a34e7c	str x28,[sp, #0x8]
00a34e80	add x28,x22,#0x48
00a34e84	mov x26,x0
00a34e88	mov x0,x24
00a34e8c	mov x1,x21
00a34e90	mov x2,x28
00a34e94	bl 0x00c38b50
00a34e98	cbz w0,0x00a35064
00a34e9c	mov x0,x24
00a34ea0	bl 0x00c369b0
00a34ea4	cbz w0,0x00a34eec
00a34ea8	ldr x1,[x22, #0x68]
00a34eac	mov x0,x25
00a34eb0	mov x2,x28
00a34eb4	mov x3,x19
00a34eb8	bl 0x00c38bb0
00a34ebc	cbz w0,0x00a35064
00a34ec0	ldr x1,[sp, #0x8]
00a34ec4	mov x0,x22
00a34ec8	mov x2,x24
00a34ecc	mov x3,x25
00a34ed0	mov x4,x19
00a34ed4	bl 0x00c3ae80
00a34ed8	cmp w0,#0x0
00a34edc	cset w21,ne
00a34ee0	b 0x00a35068
00a34ee4	mov w21,wzr
00a34ee8	b 0x00a35078
00a34eec	ldr x8,[x22]
00a34ef0	mov x0,x22
00a34ef4	mov x1,x27
00a34ef8	mov x2,x24
00a34efc	ldr x8,[x8, #0x100]
00a34f00	mov x3,x19
00a34f04	blr x8
00a34f08	cbz w0,0x00a35064
00a34f0c	ldr x8,[x22]
00a34f10	ldr x2,[x22, #0x68]
00a34f14	mov x0,x22
00a34f18	mov x1,x27
00a34f1c	ldr x8,[x8, #0x108]
00a34f20	mov x3,x27
00a34f24	mov x4,x19
00a34f28	blr x8
00a34f2c	cbz w0,0x00a35064
00a34f30	ldr x1,[x22, #0x60]
00a34f34	mov x0,x27
00a34f38	mov x2,x27
00a34f3c	bl 0x00c38b40
00a34f40	cbz w0,0x00a35064
00a34f44	mov x0,x27
00a34f48	mov x1,x24
00a34f4c	mov x2,x27
00a34f50	bl 0x00c38b40
00a34f54	cbz w0,0x00a35064
00a34f58	bl 0x00c35250
00a34f5c	mov x0,x26
00a34f60	mov x1,x27
00a34f64	mov x2,x28
00a34f68	mov x3,x19
00a34f6c	bl 0x00c38b90
00a34f70	cbz w0,0x00a34fd8
00a34f74	bl 0x00c35ed0
00a34f78	mov x0,x26
00a34f7c	bl 0x00c38d10
00a34f80	ldr x8,[x22]
00a34f84	mov w21,w0
00a34f88	mov x0,x22
00a34f8c	mov x1,x25
00a34f90	ldr x8,[x8, #0xf8]
00a34f94	mov x2,x24
00a34f98	mov x3,x26
00a34f9c	mov x4,x19
00a34fa0	blr x8
00a34fa4	cbz w0,0x00a35064
00a34fa8	cmp w23,#0x0
00a34fac	cset w8,ne
00a34fb0	cmp w21,#0x0
00a34fb4	cset w9,ne
00a34fb8	cmp w8,w9
00a34fbc	b.eq 0x00a34ec0
00a34fc0	mov x0,x25
00a34fc4	mov x1,x25
00a34fc8	mov x2,x24
00a34fcc	bl 0x00c38b40
00a34fd0	cbnz w0,0x00a34ec0
00a34fd4	b 0x00a35064
00a34fd8	bl 0x00c32420
00a34fdc	and x8,x0,#0xff800000
00a34fe0	orr w9,wzr,#0x1800000
00a34fe4	cmp x8,x9
00a34fe8	b.ne 0x00a35030
00a34fec	asr w8,w0,#0x1f
00a34ff0	and w8,w8,#0x7f800000
00a34ff4	orr w8,w8,#0x7fffff
00a34ff8	and w8,w8,w0
00a34ffc	cmp w8,#0x74
00a35000	b.ne 0x00a35030
00a35004	bl 0x00c35240
00a35008	bl 0x00c342a0
00a3500c	adrp x0,0x2c7000
00a35010	adrp x2,0x2c9000
00a35014	add x0,x0,#0x893
00a35018	add x2,x2,#0x75c
00a3501c	mov w1,#0x58
00a35020	bl 0x00c342b0
00a35024	mov w0,#0x10
00a35028	mov w1,#0x6e
00a3502c	b 0x00a3505c
00a35030	bl 0x00c35ed0
00a35034	bl 0x00c342a0
00a35038	adrp x0,0x2c7000
00a3503c	adrp x2,0x2c9000
00a35040	add x0,x0,#0x893
00a35044	add x2,x2,#0x75c
00a35048	mov w1,#0x5d
00a3504c	bl 0x00c342b0
00a35050	mov w1,#0x3
00a35054	mov w0,#0x10
00a35058	movk w1,#0x8, LSL #16
00a3505c	mov x2,xzr
00a35060	bl 0x00c342c0
00a35064	mov w21,wzr
00a35068	mov x0,x19
00a3506c	bl 0x00c38a20
00a35070	mov x0,x20
00a35074	bl 0x00c38a30
00a35078	mov w0,w21
00a3507c	ldp x29,x30,[sp, #0x60]
00a35080	ldp x20,x19,[sp, #0x50]
00a35084	ldp x22,x21,[sp, #0x40]
00a35088	ldp x24,x23,[sp, #0x30]
00a3508c	ldp x26,x25,[sp, #0x20]
00a35090	ldp x28,x27,[sp, #0x10]
00a35094	add sp,sp,#0x70
00a35098	ret
