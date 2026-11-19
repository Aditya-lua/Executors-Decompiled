; OSSL_HTTP_get @ 00b18e68
00b18e68	sub sp,sp,#0xf0
00b18e6c	stp x29,x30,[sp, #0xe0]
00b18e70	add x29,sp,#0xe0
00b18e74	stp x28,x27,[sp, #0x90]
00b18e78	ldr w28,[x29, #0x30]
00b18e7c	stp x26,x25,[sp, #0xa0]
00b18e80	stp x24,x23,[sp, #0xb0]
00b18e84	stp x22,x21,[sp, #0xc0]
00b18e88	stp x20,x19,[sp, #0xd0]
00b18e8c	mov w20,w7
00b18e90	mov x22,x6
00b18e94	mov x23,x5
00b18e98	mov x24,x4
00b18e9c	mov x25,x3
00b18ea0	mov x19,x0
00b18ea4	cmp w28,#0x1
00b18ea8	stp x1,x2,[sp, #0x40]
00b18eac	stur xzr,[x29, #-0x58]
00b18eb0	b.lt 0x00b1912c
00b18eb4	mov x0,xzr
00b18eb8	bl 0x00c30970
00b18ebc	add x21,x0,w28, SXTW 
00b18ec0	cbz x19,0x00b19134
00b18ec4	adrp x1,0x2d6000
00b18ec8	add x1,x1,#0x829
00b18ecc	mov w2,#0x478
00b18ed0	mov x0,x19
00b18ed4	bl 0x00c34600
00b18ed8	cbz x0,0x00b19164
00b18edc	add x1,sp,#0x6c
00b18ee0	sub x3,x29,#0x60
00b18ee4	sub x4,x29,#0x68
00b18ee8	add x6,sp,#0x70
00b18eec	mov x2,xzr
00b18ef0	mov x5,xzr
00b18ef4	mov x7,xzr
00b18ef8	mov x19,x0
00b18efc	str xzr,[sp]
00b18f00	bl 0x00c3dd90
00b18f04	cbz w0,0x00b192ec
00b18f08	ldr x8,[x29, #0x28]
00b18f0c	stp x24,x23,[sp, #0x28]
00b18f10	ldr x23,[x29, #0x10]
00b18f14	adrp x24,0x2d6000
00b18f18	str x8,[sp, #0x60]
00b18f1c	ldr w8,[x29, #0x20]
00b18f20	str x22,[sp, #0x38]
00b18f24	mov w22,wzr
00b18f28	add x24,x24,#0x829
00b18f2c	str w8,[sp, #0x5c]
00b18f30	ldr x8,[x29, #0x18]
00b18f34	str w20,[sp, #0x24]
00b18f38	str x8,[sp, #0x50]
00b18f3c	ldp x1,x0,[x29, #-0x68]
00b18f40	ldr w4,[sp, #0x6c]
00b18f44	ldp x8,x2,[sp, #0x38]
00b18f48	ldr x3,[sp, #0x48]
00b18f4c	ldp x6,x7,[sp, #0x28]
00b18f50	mov x5,x25
00b18f54	str w28,[sp, #0x10]
00b18f58	str w20,[sp, #0x8]
00b18f5c	str x8,[sp]
00b18f60	bl 0x00b186ec
00b18f64	mov x20,x0
00b18f68	sub w22,w22,#0x1
00b18f6c	cbz x20,0x00b18fc4
00b18f70	ldr x1,[sp, #0x70]
00b18f74	ldr x5,[sp, #0x50]
00b18f78	ldr w6,[sp, #0x5c]
00b18f7c	ldr x7,[sp, #0x60]
00b18f80	mov w8,#0xffffffff
00b18f84	mov x0,x20
00b18f88	mov x2,x23
00b18f8c	mov x3,xzr
00b18f90	mov x4,xzr
00b18f94	str wzr,[sp, #0x8]
00b18f98	str w8,[sp]
00b18f9c	bl 0x00b18a8c
00b18fa0	cbz w0,0x00b18fb8
00b18fa4	sub x1,x29,#0x58
00b18fa8	mov x0,x20
00b18fac	bl 0x00b18c64
00b18fb0	mov x26,x0
00b18fb4	b 0x00b18fc8
00b18fb8	mov x0,x20
00b18fbc	bl 0x00b171a0
00b18fc0	mov x20,xzr
00b18fc4	mov x26,xzr
00b18fc8	ldr x0,[sp, #0x70]
00b18fcc	mov w2,#0x491
00b18fd0	mov x1,x24
00b18fd4	bl 0x00c32310
00b18fd8	cbnz x26,0x00b1927c
00b18fdc	ldur x27,[x29, #-0x58]
00b18fe0	cbz x27,0x00b1927c
00b18fe4	add w26,w22,#0x1
00b18fe8	cmp w26,#0x31
00b18fec	b.ge 0x00b1916c
00b18ff0	ldrb w8,[x27]
00b18ff4	cmp w8,#0x2f
00b18ff8	b.eq 0x00b1902c
00b18ffc	adrp x1,0x2d6000
00b19000	orr w2,wzr,#0x6
00b19004	mov x0,x19
00b19008	add x1,x1,#0x85b
00b1900c	bl 0x00c31bb0
00b19010	cbnz w0,0x00b1902c
00b19014	adrp x1,0x2d6000
00b19018	orr w2,wzr,#0x6
00b1901c	mov x0,x27
00b19020	add x1,x1,#0x85b
00b19024	bl 0x00c31bb0
00b19028	cbnz w0,0x00b19238
00b1902c	mov x0,xzr
00b19030	bl 0x00c30970
00b19034	cbz x21,0x00b1904c
00b19038	subs x8,x21,x0
00b1903c	b.lt 0x00b19210
00b19040	orr w9,wzr,#0x7fffffff
00b19044	cmp x8,x9
00b19048	csel w28,w8,w9,lt
00b1904c	mov w1,#0x1
00b19050	mov x0,x25
00b19054	mov x2,xzr
00b19058	mov x3,xzr
00b1905c	bl 0x00c321a0
00b19060	mov w2,#0x496
00b19064	mov x0,x19
00b19068	mov x1,x24
00b1906c	bl 0x00c32310
00b19070	ldur x19,[x29, #-0x58]
00b19074	ldrb w8,[x19]
00b19078	cmp w8,#0x2f
00b1907c	b.ne 0x00b190a0
00b19080	mov w2,#0x499
00b19084	mov x0,x19
00b19088	mov x1,x24
00b1908c	bl 0x00c34600
00b19090	mov w22,w26
00b19094	str x0,[sp, #0x70]
00b19098	cbnz x0,0x00b18f6c
00b1909c	b 0x00b19194
00b190a0	ldur x0,[x29, #-0x60]
00b190a4	mov w2,#0x4a5
00b190a8	mov x1,x24
00b190ac	bl 0x00c32310
00b190b0	ldur x0,[x29, #-0x68]
00b190b4	mov w2,#0x4a6
00b190b8	mov x1,x24
00b190bc	bl 0x00c32310
00b190c0	add w22,w22,#0x2
00b190c4	cbz x20,0x00b190ec
00b190c8	ldr x8,[x20, #0x28]
00b190cc	cbz x8,0x00b190ec
00b190d0	ldr x0,[x20, #0x18]
00b190d4	ldr x1,[x20, #0x30]
00b190d8	mov w3,#0x1
00b190dc	mov w2,wzr
00b190e0	blr x8
00b190e4	cbz x0,0x00b190ec
00b190e8	str x0,[x20, #0x18]
00b190ec	mov x0,x20
00b190f0	bl 0x00b171a0
00b190f4	add x1,sp,#0x6c
00b190f8	sub x3,x29,#0x60
00b190fc	sub x4,x29,#0x68
00b19100	add x6,sp,#0x70
00b19104	mov x0,x19
00b19108	mov x2,xzr
00b1910c	mov x5,xzr
00b19110	mov x7,xzr
00b19114	str xzr,[sp]
00b19118	bl 0x00c3dd90
00b1911c	ldr w20,[sp, #0x24]
00b19120	mov x26,xzr
00b19124	cbnz w0,0x00b18f3c
00b19128	b 0x00b192f0
00b1912c	mov x21,xzr
00b19130	cbnz x19,0x00b18ec4
00b19134	bl 0x00c342a0
00b19138	adrp x0,0x2d6000
00b1913c	adrp x2,0x2a4000
00b19140	add x0,x0,#0x829
00b19144	add x2,x2,#0xbaf
00b19148	mov w1,#0x475
00b1914c	bl 0x00c342b0
00b19150	mov w1,#0x102
00b19154	mov w0,#0x3d
00b19158	movk w1,#0xc, LSL #16
00b1915c	mov x2,xzr
00b19160	bl 0x00c342c0
00b19164	mov x26,xzr
00b19168	b 0x00b19304
00b1916c	bl 0x00c342a0
00b19170	adrp x0,0x2d6000
00b19174	adrp x2,0x2be000
00b19178	add x0,x0,#0x829
00b1917c	add x2,x2,#0x66c
00b19180	mov w1,#0x455
00b19184	bl 0x00c342b0
00b19188	mov w0,#0x3d
00b1918c	mov w1,#0x73
00b19190	b 0x00b1925c
00b19194	ldur x0,[x29, #-0x60]
00b19198	adrp x21,0x2d6000
00b1919c	add x21,x21,#0x829
00b191a0	mov w2,#0x49b
00b191a4	mov x1,x21
00b191a8	bl 0x00c32310
00b191ac	ldur x0,[x29, #-0x68]
00b191b0	mov w2,#0x49c
00b191b4	mov x1,x21
00b191b8	bl 0x00c32310
00b191bc	cbz x20,0x00b191e4
00b191c0	ldr x8,[x20, #0x28]
00b191c4	cbz x8,0x00b191e4
00b191c8	ldr x0,[x20, #0x18]
00b191cc	ldr x1,[x20, #0x30]
00b191d0	mov w3,#0x1
00b191d4	mov w2,wzr
00b191d8	blr x8
00b191dc	cbz x0,0x00b191e4
00b191e0	str x0,[x20, #0x18]
00b191e4	mov x0,x20
00b191e8	bl 0x00b171a0
00b191ec	mov x0,xzr
00b191f0	bl 0x00c31a40
00b191f4	adrp x1,0x2d6000
00b191f8	add x1,x1,#0x829
00b191fc	mov w2,#0x4a0
00b19200	mov x0,x19
00b19204	bl 0x00c32310
00b19208	mov x26,xzr
00b1920c	b 0x00b19304
00b19210	bl 0x00c342a0
00b19214	adrp x0,0x2d6000
00b19218	adrp x2,0x2a6000
00b1921c	add x0,x0,#0x829
00b19220	add x2,x2,#0xa3e
00b19224	orr w1,wzr,#0x1ff
00b19228	bl 0x00c342b0
00b1922c	mov w0,#0x3d
00b19230	mov w1,#0x81
00b19234	b 0x00b1925c
00b19238	bl 0x00c342a0
00b1923c	adrp x0,0x2d6000
00b19240	adrp x2,0x2be000
00b19244	add x0,x0,#0x829
00b19248	add x2,x2,#0x66c
00b1924c	mov w1,#0x45c
00b19250	bl 0x00c342b0
00b19254	mov w0,#0x3d
00b19258	orr w1,wzr,#0x70
00b1925c	mov x2,xzr
00b19260	bl 0x00c342c0
00b19264	ldur x0,[x29, #-0x58]
00b19268	adrp x1,0x2d6000
00b1926c	add x1,x1,#0x829
00b19270	mov w2,#0x4ac
00b19274	bl 0x00c32310
00b19278	mov x26,xzr
00b1927c	ldur x0,[x29, #-0x60]
00b19280	adrp x21,0x2d6000
00b19284	add x21,x21,#0x829
00b19288	mov w2,#0x4ae
00b1928c	mov x1,x21
00b19290	bl 0x00c32310
00b19294	ldur x0,[x29, #-0x68]
00b19298	mov w2,#0x4af
00b1929c	mov x1,x21
00b192a0	bl 0x00c32310
00b192a4	cmp x26,#0x0
00b192a8	cset w3,ne
00b192ac	cbz x20,0x00b192d0
00b192b0	ldr x8,[x20, #0x28]
00b192b4	cbz x8,0x00b192d0
00b192b8	ldr x0,[x20, #0x18]
00b192bc	ldr x1,[x20, #0x30]
00b192c0	mov w2,wzr
00b192c4	blr x8
00b192c8	cbz x0,0x00b192dc
00b192cc	str x0,[x20, #0x18]
00b192d0	mov x0,x20
00b192d4	bl 0x00b171a0
00b192d8	b 0x00b192f0
00b192dc	mov x0,x20
00b192e0	bl 0x00b171a0
00b192e4	mov x0,x26
00b192e8	bl 0x00c31a40
00b192ec	mov x26,xzr
00b192f0	adrp x1,0x2d6000
00b192f4	add x1,x1,#0x829
00b192f8	mov w2,#0x4b7
00b192fc	mov x0,x19
00b19300	bl 0x00c32310
00b19304	mov x0,x26
00b19308	ldp x29,x30,[sp, #0xe0]
00b1930c	ldp x20,x19,[sp, #0xd0]
00b19310	ldp x22,x21,[sp, #0xc0]
00b19314	ldp x24,x23,[sp, #0xb0]
00b19318	ldp x26,x25,[sp, #0xa0]
00b1931c	ldp x28,x27,[sp, #0x90]
00b19320	add sp,sp,#0xf0
00b19324	ret
