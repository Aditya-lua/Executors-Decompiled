; std::__ndk1::money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00bf2f04
00bf2f04	paciasp
00bf2f08	stp x29,x30,[sp, #-0x60]!
00bf2f0c	stp x28,x27,[sp, #0x10]
00bf2f10	stp x26,x25,[sp, #0x20]
00bf2f14	stp x24,x23,[sp, #0x30]
00bf2f18	stp x22,x21,[sp, #0x40]
00bf2f1c	stp x20,x19,[sp, #0x50]
00bf2f20	mov x29,sp
00bf2f24	sub sp,sp,#0x250
00bf2f28	sub x8,x29,#0x10
00bf2f2c	mov x0,x3
00bf2f30	mov x22,x5
00bf2f34	mov w26,w4
00bf2f38	mov x20,x3
00bf2f3c	mov w25,w2
00bf2f40	mov x21,x1
00bf2f44	bl 0x00c30070
00bf2f48	adrp x23,0xcb5000
00bf2f4c	ldr x23,[x23, #0xb98]
00bf2f50	ldur x19,[x29, #-0x10]
00bf2f54	stur x23,[x29, #-0x50]
00bf2f58	ldar x8,[x23]
00bf2f5c	cmn x8,#0x1
00bf2f60	b.eq 0x00bf2f8c
00bf2f64	sub x8,x29,#0x50
00bf2f68	add x9,sp,#0x50
00bf2f6c	str x8,[sp, #0x50]
00bf2f70	stur x9,[x29, #-0x38]
00bf2f74	adrp x0,0xcb5000
00bf2f78	nop
00bf2f7c	adr x2,0xc0bab0
00bf2f80	ldr x0,[x0, #0xb98]
00bf2f84	sub x1,x29,#0x38
00bf2f88	bl 0x00c305d0
00bf2f8c	ldp x8,x10,[x19, #0x10]
00bf2f90	ldrsw x9,[x23, #0x8]
00bf2f94	sub x9,x9,#0x1
00bf2f98	sub x10,x10,x8
00bf2f9c	cmp x9,x10, ASR #0x3
00bf2fa0	b.cs 0x00bf3228
00bf2fa4	ldr x23,[x8, x9, LSL #0x3]
00bf2fa8	cbz x23,0x00bf3228
00bf2fac	ldrb w8,[x22]
00bf2fb0	ldr x9,[x22, #0x8]
00bf2fb4	lsr x10,x8,#0x1
00bf2fb8	tst w8,#0x1
00bf2fbc	csel x9,x10,x9,eq
00bf2fc0	cbz x9,0x00bf2ff8
00bf2fc4	ldr x9,[x22, #0x10]
00bf2fc8	add x10,x22,#0x4
00bf2fcc	tst w8,#0x1
00bf2fd0	ldr x8,[x23]
00bf2fd4	csel x9,x10,x9,eq
00bf2fd8	ldr w19,[x9]
00bf2fdc	ldr x8,[x8, #0x58]
00bf2fe0	mov x0,x23
00bf2fe4	mov w1,#0x2d
00bf2fe8	blr x8
00bf2fec	cmp w19,w0
00bf2ff0	cset w24,eq
00bf2ff4	b 0x00bf2ffc
00bf2ff8	mov w24,wzr
00bf2ffc	str x20,[sp, #0x38]
00bf3000	stp xzr,xzr,[x29, #-0x38]
00bf3004	stur xzr,[x29, #-0x28]
00bf3008	stp xzr,xzr,[x29, #-0x50]
00bf300c	stur xzr,[x29, #-0x40]
00bf3010	stp xzr,xzr,[x29, #-0x68]
00bf3014	stur xzr,[x29, #-0x58]
00bf3018	sub x8,x29,#0x6c
00bf301c	sub x9,x29,#0x68
00bf3020	and w0,w25,#0x1
00bf3024	sub x2,x29,#0x10
00bf3028	sub x3,x29,#0x14
00bf302c	sub x4,x29,#0x18
00bf3030	sub x5,x29,#0x1c
00bf3034	sub x6,x29,#0x38
00bf3038	sub x7,x29,#0x50
00bf303c	mov w1,w24
00bf3040	stp x9,x8,[sp]
00bf3044	bl 0x00c44260
00bf3048	ldrb w28,[x22]
00bf304c	ldr x8,[x22, #0x8]
00bf3050	mov x20,x21
00bf3054	ldursw x27,[x29, #-0x6c]
00bf3058	lsr x9,x28,#0x1
00bf305c	tst w28,#0x1
00bf3060	csel x19,x9,x8,eq
00bf3064	cmp w27,w19
00bf3068	b.ge 0x00bf30ac
00bf306c	ldurb w8,[x29, #-0x68]
00bf3070	ldurb w9,[x29, #-0x50]
00bf3074	ldur x10,[x29, #-0x60]
00bf3078	lsr x11,x8,#0x1
00bf307c	tst w8,#0x1
00bf3080	ldur x8,[x29, #-0x48]
00bf3084	lsr x12,x9,#0x1
00bf3088	csel x10,x11,x10,eq
00bf308c	sub x11,x19,x27
00bf3090	tst w9,#0x1
00bf3094	csel x8,x12,x8,eq
00bf3098	add x9,x27,x11, LSL #0x1
00bf309c	add x8,x10,x8
00bf30a0	add x8,x9,x8
00bf30a4	add x8,x8,#0x1
00bf30a8	b 0x00bf30e0
00bf30ac	ldurb w8,[x29, #-0x68]
00bf30b0	ldurb w9,[x29, #-0x50]
00bf30b4	ldur x10,[x29, #-0x60]
00bf30b8	lsr x11,x8,#0x1
00bf30bc	tst w8,#0x1
00bf30c0	ldur x8,[x29, #-0x48]
00bf30c4	lsr x12,x9,#0x1
00bf30c8	csel x10,x11,x10,eq
00bf30cc	tst w9,#0x1
00bf30d0	csel x8,x12,x8,eq
00bf30d4	add x9,x27,x10
00bf30d8	add x8,x9,x8
00bf30dc	add x8,x8,#0x2
00bf30e0	mov w21,w26
00bf30e4	cmp x8,#0x65
00bf30e8	b.cc 0x00bf3104
00bf30ec	lsl x0,x8,#0x2
00bf30f0	bl 0x00c308d0
00bf30f4	mov x25,x0
00bf30f8	mov x26,x0
00bf30fc	cbnz x0,0x00bf310c
00bf3100	bl 0x00c43cc0
00bf3104	mov x25,xzr
00bf3108	add x26,sp,#0x50
00bf310c	ldr x8,[x22, #0x10]
00bf3110	add x9,x22,#0x4
00bf3114	tst w28,#0x1
00bf3118	ldr x22,[sp, #0x38]
00bf311c	csel x4,x9,x8,eq
00bf3120	ldp w9,w8,[x29, #-0x1c]
00bf3124	ldr w3,[x22, #0x8]
00bf3128	add x5,x4,x19, LSL #0x2
00bf312c	sub x10,x29,#0x68
00bf3130	sub x11,x29,#0x50
00bf3134	add x1,sp,#0x48
00bf3138	stp x11,x10,[sp, #0x20]
00bf313c	sub x10,x29,#0x38
00bf3140	add x2,sp,#0x40
00bf3144	str x10,[sp, #0x18]
00bf3148	sub x10,x29,#0x14
00bf314c	mov x0,x26
00bf3150	mov x6,x23
00bf3154	mov w7,w24
00bf3158	str w27,[sp, #0x30]
00bf315c	str w9,[sp, #0x10]
00bf3160	str w8,[sp, #0x8]
00bf3164	str x10,[sp]
00bf3168	bl 0x00c44270
00bf316c	ldp x3,x2,[sp, #0x40]
00bf3170	mov x0,x20
00bf3174	mov x1,x26
00bf3178	mov x4,x22
00bf317c	mov w5,w21
00bf3180	bl 0x00be6bec
00bf3184	mov x19,x0
00bf3188	cbz x25,0x00bf3194
00bf318c	mov x0,x25
00bf3190	bl 0x00c30960
00bf3194	ldurb w8,[x29, #-0x68]
00bf3198	tbnz w8,#0x0,0x00bf31ec
00bf319c	ldurb w8,[x29, #-0x50]
00bf31a0	tbnz w8,#0x0,0x00bf3208
00bf31a4	ldurb w8,[x29, #-0x38]
00bf31a8	tbz w8,#0x0,0x00bf31bc
00bf31ac	ldur x8,[x29, #-0x38]
00bf31b0	ldur x0,[x29, #-0x28]
00bf31b4	and x1,x8,#-0x2
00bf31b8	bl 0x00c2fe80
00bf31bc	sub x0,x29,#0x10
00bf31c0	bl 0x00c30090
00bf31c4	mov x0,x19
00bf31c8	add sp,sp,#0x250
00bf31cc	ldp x20,x19,[sp, #0x50]
00bf31d0	ldp x22,x21,[sp, #0x40]
00bf31d4	ldp x24,x23,[sp, #0x30]
00bf31d8	ldp x26,x25,[sp, #0x20]
00bf31dc	ldp x28,x27,[sp, #0x10]
00bf31e0	ldp x29,x30,[sp], #0x60
00bf31e4	autiasp
00bf31e8	ret
00bf31ec	ldur x8,[x29, #-0x68]
00bf31f0	ldur x0,[x29, #-0x58]
00bf31f4	lsl x8,x8,#0x2
00bf31f8	and x1,x8,#-0x8
00bf31fc	bl 0x00c2fe80
00bf3200	ldurb w8,[x29, #-0x50]
00bf3204	tbz w8,#0x0,0x00bf31a4
00bf3208	ldur x8,[x29, #-0x50]
00bf320c	ldur x0,[x29, #-0x40]
00bf3210	lsl x8,x8,#0x2
00bf3214	and x1,x8,#-0x8
00bf3218	bl 0x00c2fe80
00bf321c	ldurb w8,[x29, #-0x38]
00bf3220	tbnz w8,#0x0,0x00bf31ac
00bf3224	b 0x00bf31bc
00bf3228	bl 0x00bd8968
