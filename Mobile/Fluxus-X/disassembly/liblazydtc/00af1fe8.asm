; X509_load_cert_file_ex @ 00af1fe8
00af1fe8	sub sp,sp,#0x50
00af1fec	stp x24,x23,[sp, #0x10]
00af1ff0	stp x22,x21,[sp, #0x20]
00af1ff4	stp x20,x19,[sp, #0x30]
00af1ff8	stp x29,x30,[sp, #0x40]
00af1ffc	add x29,sp,#0x40
00af2000	mov x22,x4
00af2004	mov x23,x3
00af2008	mov w21,w2
00af200c	mov x24,x1
00af2010	mov x20,x0
00af2014	str xzr,[sp, #0x8]
00af2018	bl 0x00c32270
00af201c	bl 0x00c32240
00af2020	mov x19,x0
00af2024	cbz x0,0x00af2078
00af2028	mov w1,#0x6c
00af202c	orr w2,wzr,#0x3
00af2030	mov x0,x19
00af2034	mov x3,x24
00af2038	bl 0x00c321a0
00af203c	cmp w0,#0x0
00af2040	b.le 0x00af2078
00af2044	sub w8,w21,#0x1
00af2048	cmp w8,#0x2
00af204c	b.cc 0x00af20d8
00af2050	bl 0x00c342a0
00af2054	adrp x0,0x2dc000
00af2058	adrp x2,0x2bc000
00af205c	add x0,x0,#0xa05
00af2060	add x2,x2,#0x549
00af2064	mov w1,#0x69
00af2068	bl 0x00c342b0
00af206c	mov w0,#0xb
00af2070	mov w1,#0x64
00af2074	b 0x00af20a0
00af2078	bl 0x00c342a0
00af207c	adrp x0,0x2dc000
00af2080	adrp x2,0x2bc000
00af2084	add x0,x0,#0xa05
00af2088	add x2,x2,#0x549
00af208c	mov w1,#0x64
00af2090	bl 0x00c342b0
00af2094	mov w1,#0x2
00af2098	mov w0,#0xb
00af209c	movk w1,#0x8, LSL #16
00af20a0	mov x2,xzr
00af20a4	bl 0x00c342c0
00af20a8	mov w21,wzr
00af20ac	ldr x0,[sp, #0x8]
00af20b0	bl 0x00c31a90
00af20b4	mov x0,x19
00af20b8	bl 0x00c31a40
00af20bc	mov w0,w21
00af20c0	ldp x29,x30,[sp, #0x40]
00af20c4	ldp x20,x19,[sp, #0x30]
00af20c8	ldp x22,x21,[sp, #0x20]
00af20cc	ldp x24,x23,[sp, #0x10]
00af20d0	add sp,sp,#0x50
00af20d4	ret
00af20d8	mov x0,x23
00af20dc	mov x1,x22
00af20e0	bl 0x00c350a0
00af20e4	str x0,[sp, #0x8]
00af20e8	cbz x0,0x00af2190
00af20ec	cmp w21,#0x2
00af20f0	b.eq 0x00af21bc
00af20f4	cmp w21,#0x1
00af20f8	b.ne 0x00af21e0
00af20fc	bl 0x00c35250
00af2100	adrp x3,0x2ab000
00af2104	add x3,x3,#0x32c
00af2108	add x1,sp,#0x8
00af210c	mov x0,x19
00af2110	mov x2,xzr
00af2114	bl 0x00c32650
00af2118	mov w21,wzr
00af211c	cbz x0,0x00af2168
00af2120	adrp x22,0x2ab000
00af2124	add x22,x22,#0x32c
00af2128	bl 0x00c35ed0
00af212c	ldr x0,[x20, #0x18]
00af2130	ldr x1,[sp, #0x8]
00af2134	bl 0x00c31a80
00af2138	cbz w0,0x00af20a8
00af213c	ldr x0,[sp, #0x8]
00af2140	add w21,w21,#0x1
00af2144	bl 0x00c31a90
00af2148	str xzr,[sp, #0x8]
00af214c	bl 0x00c35250
00af2150	add x1,sp,#0x8
00af2154	mov x0,x19
00af2158	mov x2,xzr
00af215c	mov x3,x22
00af2160	bl 0x00c32650
00af2164	cbnz x0,0x00af2128
00af2168	bl 0x00c32420
00af216c	cbz w21,0x00af2208
00af2170	asr w8,w0,#0x1f
00af2174	and w8,w8,#0x7f800000
00af2178	orr w8,w8,#0x7fffff
00af217c	and w8,w8,w0
00af2180	cmp w8,#0x6c
00af2184	b.ne 0x00af2208
00af2188	bl 0x00c35240
00af218c	b 0x00af20ac
00af2190	bl 0x00c342a0
00af2194	adrp x0,0x2dc000
00af2198	adrp x2,0x2bc000
00af219c	add x0,x0,#0xa05
00af21a0	add x2,x2,#0x549
00af21a4	mov w1,#0x6e
00af21a8	bl 0x00c342b0
00af21ac	mov w1,#0x100
00af21b0	mov w0,#0xb
00af21b4	movk w1,#0xc, LSL #16
00af21b8	b 0x00af20a0
00af21bc	add x1,sp,#0x8
00af21c0	mov x0,x19
00af21c4	bl 0x00c32d90
00af21c8	cbz x0,0x00af2210
00af21cc	ldr x0,[x20, #0x18]
00af21d0	ldr x1,[sp, #0x8]
00af21d4	bl 0x00c31a80
00af21d8	mov w21,w0
00af21dc	b 0x00af20ac
00af21e0	bl 0x00c342a0
00af21e4	adrp x0,0x2dc000
00af21e8	adrp x2,0x2bc000
00af21ec	add x0,x0,#0xa05
00af21f0	add x2,x2,#0x549
00af21f4	mov w1,#0x93
00af21f8	bl 0x00c342b0
00af21fc	mov w0,#0xb
00af2200	mov w1,#0x87
00af2204	b 0x00af20a0
00af2208	bl 0x00c35ed0
00af220c	b 0x00af20a8
00af2210	bl 0x00c342a0
00af2214	adrp x0,0x2dc000
00af2218	adrp x2,0x2bc000
00af221c	add x0,x0,#0xa05
00af2220	add x2,x2,#0x549
00af2224	mov w1,#0x8a
00af2228	bl 0x00c342b0
00af222c	mov w8,#0x2
00af2230	movk w8,#0x8, LSL #16
00af2234	add w1,w8,#0xb
00af2238	mov w0,#0xb
00af223c	b 0x00af20a0
