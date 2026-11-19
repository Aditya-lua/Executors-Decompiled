; psa_reserve_free_key_slot @ 00ba2ea8
00ba2ea8	stp x24,x23,[sp, #-0x40]!
00ba2eac	stp x22,x21,[sp, #0x10]
00ba2eb0	stp x20,x19,[sp, #0x20]
00ba2eb4	stp x29,x30,[sp, #0x30]
00ba2eb8	add x29,sp,#0x30
00ba2ebc	adrp x8,0xd26000
00ba2ec0	ldrb w8,[x8, #0x190]
00ba2ec4	mov x19,x1
00ba2ec8	mov x20,x0
00ba2ecc	cmp w8,#0x1
00ba2ed0	b.ne 0x00ba2ef0
00ba2ed4	cbz x20,0x00ba2efc
00ba2ed8	adrp x8,0xd26000
00ba2edc	ldr x22,[x8, #0xe0]
00ba2ee0	cmn x22,#0x1
00ba2ee4	b.eq 0x00ba2f94
00ba2ee8	mov x23,xzr
00ba2eec	b 0x00ba3174
00ba2ef0	mov w0,#0xffffff77
00ba2ef4	str xzr,[x19]
00ba2ef8	b 0x00ba3218
00ba2efc	adrp x8,0xd26000
00ba2f00	add x8,x8,#0x28
00ba2f04	ldr x8,[x8, #0xb0]
00ba2f08	mov x9,xzr
00ba2f0c	ldr w10,[x8, #0x18]
00ba2f10	cbz w10,0x00ba2f4c
00ba2f14	cbnz x20,0x00ba2f38
00ba2f18	cmp w10,#0x2
00ba2f1c	b.ne 0x00ba2f38
00ba2f20	ldr x10,[x8, #0x20]
00ba2f24	mov x20,xzr
00ba2f28	cbnz x10,0x00ba2f38
00ba2f2c	ldrb w10,[x8, #0x4]
00ba2f30	cmp w10,#0x0
00ba2f34	csel x20,xzr,x8,eq
00ba2f38	add x9,x9,#0x1
00ba2f3c	cmp x9,#0x20
00ba2f40	add x8,x8,#0x38
00ba2f44	b.cc 0x00ba2f0c
00ba2f48	mov x8,xzr
00ba2f4c	cbz x20,0x00ba2fb0
00ba2f50	cbnz x8,0x00ba2fb0
00ba2f54	mov x21,x20
00ba2f58	ldr w8,[x21, #0x18]!
00ba2f5c	cmp w8,#0x2
00ba2f60	b.ne 0x00ba2f78
00ba2f64	ldr x8,[x20, #0x20]
00ba2f68	cmn x8,#0x1
00ba2f6c	b.eq 0x00ba2f78
00ba2f70	add x8,x8,#0x1
00ba2f74	str x8,[x20, #0x20]
00ba2f78	mov x0,x20
00ba2f7c	bl 0x00c42da0
00ba2f80	cbnz w0,0x00ba2ef4
00ba2f84	ldr w8,[x20, #0x18]
00ba2f88	cbz w8,0x00ba2fc4
00ba2f8c	mov w0,#0xffffff69
00ba2f90	b 0x00ba2ef4
00ba2f94	adrp x8,0xd26000
00ba2f98	add x8,x8,#0xe0
00ba2f9c	ldr x22,[x8, #0x8]
00ba2fa0	cmn x22,#0x1
00ba2fa4	b.eq 0x00ba2fe0
00ba2fa8	mov w23,#0x1
00ba2fac	b 0x00ba3174
00ba2fb0	cbz x8,0x00ba2ff4
00ba2fb4	add x21,x8,#0x18
00ba2fb8	mov x20,x8
00ba2fbc	ldr w8,[x20, #0x18]
00ba2fc0	cbnz w8,0x00ba2f8c
00ba2fc4	mov w8,#0x1
00ba2fc8	mov w9,#0x16
00ba2fcc	mov w0,wzr
00ba2fd0	str w8,[x21]
00ba2fd4	strb w9,[x20, #0x1c]
00ba2fd8	str x20,[x19]
00ba2fdc	b 0x00ba3218
00ba2fe0	ldr x22,[x8, #0x10]
00ba2fe4	cmn x22,#0x1
00ba2fe8	b.eq 0x00ba2ffc
00ba2fec	mov w23,#0x2
00ba2ff0	b 0x00ba3174
00ba2ff4	mov w0,#0xffffff73
00ba2ff8	b 0x00ba2ef4
00ba2ffc	ldr x22,[x8, #0x18]
00ba3000	cmn x22,#0x1
00ba3004	b.eq 0x00ba3010
00ba3008	orr w23,wzr,#0x3
00ba300c	b 0x00ba3174
00ba3010	ldr x22,[x8, #0x20]
00ba3014	cmn x22,#0x1
00ba3018	b.eq 0x00ba3024
00ba301c	mov w23,#0x4
00ba3020	b 0x00ba3174
00ba3024	ldr x22,[x8, #0x28]
00ba3028	cmn x22,#0x1
00ba302c	b.eq 0x00ba3038
00ba3030	mov w23,#0x5
00ba3034	b 0x00ba3174
00ba3038	ldr x22,[x8, #0x30]
00ba303c	cmn x22,#0x1
00ba3040	b.eq 0x00ba304c
00ba3044	orr w23,wzr,#0x6
00ba3048	b 0x00ba3174
00ba304c	ldr x22,[x8, #0x38]
00ba3050	cmn x22,#0x1
00ba3054	b.eq 0x00ba3060
00ba3058	orr w23,wzr,#0x7
00ba305c	b 0x00ba3174
00ba3060	ldr x22,[x8, #0x40]
00ba3064	cmn x22,#0x1
00ba3068	b.eq 0x00ba3074
00ba306c	mov w23,#0x8
00ba3070	b 0x00ba3174
00ba3074	ldr x22,[x8, #0x48]
00ba3078	cmn x22,#0x1
00ba307c	b.eq 0x00ba3088
00ba3080	mov w23,#0x9
00ba3084	b 0x00ba3174
00ba3088	ldr x22,[x8, #0x50]
00ba308c	cmn x22,#0x1
00ba3090	b.eq 0x00ba309c
00ba3094	mov w23,#0xa
00ba3098	b 0x00ba3174
00ba309c	ldr x22,[x8, #0x58]
00ba30a0	cmn x22,#0x1
00ba30a4	b.eq 0x00ba30b0
00ba30a8	mov w23,#0xb
00ba30ac	b 0x00ba3174
00ba30b0	ldr x22,[x8, #0x60]
00ba30b4	cmn x22,#0x1
00ba30b8	b.eq 0x00ba30c4
00ba30bc	orr w23,wzr,#0xc
00ba30c0	b 0x00ba3174
00ba30c4	ldr x22,[x8, #0x68]
00ba30c8	cmn x22,#0x1
00ba30cc	b.eq 0x00ba30d8
00ba30d0	mov w23,#0xd
00ba30d4	b 0x00ba3174
00ba30d8	ldr x22,[x8, #0x70]
00ba30dc	cmn x22,#0x1
00ba30e0	b.eq 0x00ba30ec
00ba30e4	orr w23,wzr,#0xe
00ba30e8	b 0x00ba3174
00ba30ec	ldr x22,[x8, #0x78]
00ba30f0	cmn x22,#0x1
00ba30f4	b.eq 0x00ba3100
00ba30f8	orr w23,wzr,#0xf
00ba30fc	b 0x00ba3174
00ba3100	ldr x22,[x8, #0x80]
00ba3104	cmn x22,#0x1
00ba3108	b.eq 0x00ba3114
00ba310c	mov w23,#0x10
00ba3110	b 0x00ba3174
00ba3114	ldr x22,[x8, #0x88]
00ba3118	cmn x22,#0x1
00ba311c	b.eq 0x00ba3128
00ba3120	mov w23,#0x11
00ba3124	b 0x00ba3174
00ba3128	ldr x22,[x8, #0x90]
00ba312c	cmn x22,#0x1
00ba3130	b.eq 0x00ba313c
00ba3134	mov w23,#0x12
00ba3138	b 0x00ba3174
00ba313c	ldr x22,[x8, #0x98]
00ba3140	cmn x22,#0x1
00ba3144	b.eq 0x00ba3150
00ba3148	mov w23,#0x13
00ba314c	b 0x00ba3174
00ba3150	ldr x22,[x8, #0xa0]
00ba3154	cmn x22,#0x1
00ba3158	b.eq 0x00ba3164
00ba315c	mov w23,#0x14
00ba3160	b 0x00ba3174
00ba3164	ldr x22,[x8, #0xa8]
00ba3168	cmn x22,#0x1
00ba316c	b.eq 0x00ba3214
00ba3170	mov w23,#0x15
00ba3174	adrp x24,0xd26000
00ba3178	add x24,x24,#0x28
00ba317c	ldr x8,[x24, x23, LSL #0x3]
00ba3180	and x9,x23,#0xffffffff
00ba3184	mov w10,#0x10
00ba3188	lsl w21,w10,w9
00ba318c	cbnz x8,0x00ba31a8
00ba3190	orr w1,wzr,#0x38
00ba3194	mov x0,x21
00ba3198	bl 0x00c30a30
00ba319c	mov x8,x0
00ba31a0	str x0,[x24, x23, LSL #0x3]
00ba31a4	cbz x0,0x00ba3214
00ba31a8	orr w9,w22,w23, LSL #0x19
00ba31ac	orr w10,wzr,#0x38
00ba31b0	orr w11,w9,#0x40000000
00ba31b4	madd x9,x22,x10,x8
00ba31b8	str w11,[x20]
00ba31bc	ldrsw x10,[x9, #0x20]
00ba31c0	adrp x11,0xd26000
00ba31c4	mov x12,#-0x1
00ba31c8	add x11,x11,#0xe0
00ba31cc	add x10,x22,x10
00ba31d0	add x13,x10,#0x1
00ba31d4	cmp x13,x21
00ba31d8	csinc x10,x12,x10,cs
00ba31dc	str x10,[x11, x23, LSL #0x3]
00ba31e0	str wzr,[x9, #0x20]
00ba31e4	ldr w10,[x9, #0x18]!
00ba31e8	cbz w10,0x00ba31f4
00ba31ec	mov w0,#0xffffff69
00ba31f0	b 0x00ba3218
00ba31f4	orr w10,wzr,#0x38
00ba31f8	mov w11,#0x1
00ba31fc	madd x8,x22,x10,x8
00ba3200	mov w0,wzr
00ba3204	str w11,[x9]
00ba3208	str x8,[x19]
00ba320c	strb w23,[x8, #0x1c]
00ba3210	b 0x00ba3218
00ba3214	mov w0,#0xffffff73
00ba3218	ldp x29,x30,[sp, #0x30]
00ba321c	ldp x20,x19,[sp, #0x20]
00ba3220	ldp x22,x21,[sp, #0x10]
00ba3224	ldp x24,x23,[sp], #0x40
00ba3228	ret
