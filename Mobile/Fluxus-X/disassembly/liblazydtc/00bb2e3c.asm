; ZSTD_decompressStream @ 00bb2e3c
00bb2e3c	sub sp,sp,#0x100
00bb2e40	stp x29,x30,[sp, #0xa0]
00bb2e44	stp x28,x27,[sp, #0xb0]
00bb2e48	stp x26,x25,[sp, #0xc0]
00bb2e4c	stp x24,x23,[sp, #0xd0]
00bb2e50	stp x22,x21,[sp, #0xe0]
00bb2e54	stp x20,x19,[sp, #0xf0]
00bb2e58	add x29,sp,#0xa0
00bb2e5c	mrs x22,tpidr_el0
00bb2e60	ldr x8,[x22, #0x28]
00bb2e64	stur x8,[x29, #-0x8]
00bb2e68	ldp x12,x11,[x2, #0x8]
00bb2e6c	subs x15,x12,x11
00bb2e70	b.cs 0x00bb2e7c
00bb2e74	mov x0,#-0x48
00bb2e78	b 0x00bb36bc
00bb2e7c	ldp x14,x13,[x1, #0x8]
00bb2e80	mov x21,x1
00bb2e84	cmp x13,x14
00bb2e88	b.ls 0x00bb2e94
00bb2e8c	mov x0,#-0x46
00bb2e90	b 0x00bb36bc
00bb2e94	mov w8,#0x74f8
00bb2e98	ldr x9,[x2]
00bb2e9c	mov x20,x2
00bb2ea0	add x23,x0,x8
00bb2ea4	ldr x8,[x21]
00bb2ea8	mov x19,x0
00bb2eac	ldr w10,[x23, #0x178]
00bb2eb0	cmp w10,#0x1
00bb2eb4	b.ne 0x00bb2ee8
00bb2eb8	ldr w10,[x23, #0x124]
00bb2ebc	cbz w10,0x00bb2ee8
00bb2ec0	ldr x10,[x19, #0x7678]
00bb2ec4	mov x0,#-0x68
00bb2ec8	cmp x10,x8
00bb2ecc	b.ne 0x00bb36bc
00bb2ed0	ldr x10,[x19, #0x7688]
00bb2ed4	cmp x10,x13
00bb2ed8	b.ne 0x00bb36bc
00bb2edc	ldr x10,[x19, #0x7680]
00bb2ee0	cmp x10,x14
00bb2ee4	b.ne 0x00bb36bc
00bb2ee8	stp x12,x11,[sp, #0x18]
00bb2eec	add x11,x9,x11
00bb2ef0	add x9,x9,x12
00bb2ef4	stur x9,[x29, #-0x30]
00bb2ef8	mov w9,#0x7678
00bb2efc	add x24,x8,x13
00bb2f00	add x26,x8,x14
00bb2f04	add x8,x19,x9
00bb2f08	add x10,x19,#0x17, LSL #12
00bb2f0c	stur x8,[x29, #-0x48]
00bb2f10	mov w8,#0x7650
00bb2f14	add x10,x10,#0x6c4
00bb2f18	add x25,x19,x8
00bb2f1c	mov w8,#0x75e8
00bb2f20	str x15,[sp, #0x10]
00bb2f24	add x8,x19,x8
00bb2f28	stur x22,[x29, #-0x40]
00bb2f2c	str x13,[sp, #0x38]
00bb2f30	stur x10,[x29, #-0x38]
00bb2f34	str x14,[sp, #0x30]
00bb2f38	str x8,[sp, #0x28]
00bb2f3c	str x11,[sp, #0x48]
00bb2f40	stur x11,[x29, #-0x28]
00bb2f44	str x24,[sp, #0x40]
00bb2f48	ldr w8,[x23, #0x124]
00bb2f4c	cmp w8,#0x4
00bb2f50	b.ne 0x00bb2fd4
00bb2f54	ldr x9,[x19, #0x7658]
00bb2f58	ldr x8,[x19, #0x7650]
00bb2f5c	sub x28,x26,x24
00bb2f60	sub x22,x9,x8
00bb2f64	cmp x28,x22
00bb2f68	csel x27,x28,x22,cc
00bb2f6c	cbz x27,0x00bb2f88
00bb2f70	ldr x9,[x19, #0x7640]
00bb2f74	mov x0,x24
00bb2f78	mov x2,x27
00bb2f7c	add x1,x9,x8
00bb2f80	bl 0x00c2ffd0
00bb2f84	ldr x8,[x19, #0x7650]
00bb2f88	add x9,x24,x27
00bb2f8c	cmp x24,#0x0
00bb2f90	add x8,x8,x27
00bb2f94	csel x24,xzr,x9,eq
00bb2f98	cmp x22,x28
00bb2f9c	str x8,[x25]
00bb2fa0	b.hi 0x00bb3620
00bb2fa4	ldr x9,[x19, #0x7648]
00bb2fa8	ldr x10,[x19, #0x74e8]
00bb2fac	cmp x9,x10
00bb2fb0	mov w10,#0x2
00bb2fb4	str w10,[x23, #0x124]
00bb2fb8	b.cs 0x00bb2f48
00bb2fbc	ldr w10,[x23]
00bb2fc0	add x8,x8,x10
00bb2fc4	cmp x8,x9
00bb2fc8	b.ls 0x00bb2f48
00bb2fcc	stp xzr,xzr,[x25]
00bb2fd0	b 0x00bb2f48
00bb2fd4	cmp w8,#0x1
00bb2fd8	b.gt 0x00bb2ff4
00bb2fdc	cbz w8,0x00bb3014
00bb2fe0	cmp w8,#0x1
00bb2fe4	b.ne 0x00bb3614
00bb2fe8	ldr x2,[x19, #0x7660]
00bb2fec	str x21,[sp, #0x50]
00bb2ff0	b 0x00bb3048
00bb2ff4	cmp w8,#0x2
00bb2ff8	b.eq 0x00bb33d0
00bb2ffc	cmp w8,#0x3
00bb3000	b.ne 0x00bb3614
00bb3004	ldr x4,[x19, #0x74e0]
00bb3008	ldr w22,[x23, #0x34]
00bb300c	ldur x10,[x29, #-0x28]
00bb3010	b 0x00bb3430
00bb3014	mov w8,#0x1
00bb3018	str xzr,[x19, #0x7630]
00bb301c	ldur x9,[x29, #-0x48]
00bb3020	str w8,[x23, #0x124]
00bb3024	mov x2,xzr
00bb3028	stp xzr,xzr,[x25, #0x8]
00bb302c	str xzr,[x25]
00bb3030	str wzr,[x25, #0x18]
00bb3034	ldr x8,[x21, #0x10]
00bb3038	ldr q0,[x21]
00bb303c	str x21,[sp, #0x50]
00bb3040	str x8,[x9, #0x10]
00bb3044	str q0,[x9]
00bb3048	ldr w3,[x23, #0xa0]
00bb304c	mov w8,#0x74e8
00bb3050	ldur x1,[x29, #-0x38]
00bb3054	add x0,x19,x8
00bb3058	bl 0x00c435f0
00bb305c	ldr w8,[x23, #0x118]
00bb3060	cbz w8,0x00bb30f4
00bb3064	ldr x27,[x19, #0x7608]
00bb3068	cbz x27,0x00bb30f4
00bb306c	ldr x8,[x19, #0x75f0]
00bb3070	cbz x8,0x00bb30f4
00bb3074	ldr w28,[x23, #0xc]
00bb3078	str x0,[sp, #0x8]
00bb307c	sub x0,x29,#0x20
00bb3080	mov w1,#0x4
00bb3084	mov x2,xzr
00bb3088	stur w28,[x29, #-0x20]
00bb308c	bl 0x00c436b0
00bb3090	ldr x8,[x27, #0x8]
00bb3094	sub x22,x8,#0x1
00bb3098	and x8,x22,x0
00bb309c	ldr x9,[x27]
00bb30a0	mov x21,x8
00bb30a4	ldr x0,[x9, x8, LSL #0x3]
00bb30a8	bl 0x00c435d0
00bb30ac	and x8,x21,x22
00bb30b0	cmp w0,w28
00bb30b4	ccmp w0,#0x0,#0x4,ne
00bb30b8	add x8,x8,#0x1
00bb30bc	b.ne 0x00bb309c
00bb30c0	ldr x8,[x27]
00bb30c4	ldr x0,[sp, #0x8]
00bb30c8	ldr x21,[x8, x21, LSL #0x3]
00bb30cc	cbz x21,0x00bb30f4
00bb30d0	ldr x0,[x19, #0x75e8]
00bb30d4	bl 0x00c435b0
00bb30d8	ldr w8,[x23, #0xc]
00bb30dc	ldr x0,[sp, #0x8]
00bb30e0	str xzr,[x19, #0x75e8]
00bb30e4	str x21,[x19, #0x75f0]
00bb30e8	str w8,[x23, #0x100]
00bb30ec	mov w8,#0xffffffff
00bb30f0	str w8,[x23, #0x108]
00bb30f4	cmn x0,#0x78
00bb30f8	b.hi 0x00bb3618
00bb30fc	cbz x0,0x00bb3144
00bb3100	ldp x8,x1,[x29, #-0x30]
00bb3104	mov x21,x0
00bb3108	ldr x27,[x19, #0x7660]
00bb310c	sub x22,x0,x27
00bb3110	sub x28,x8,x1
00bb3114	cmp x22,x28
00bb3118	b.hi 0x00bb3778
00bb311c	ldur x8,[x29, #-0x38]
00bb3120	mov x2,x22
00bb3124	add x0,x8,x27
00bb3128	mov x27,x1
00bb312c	bl 0x00c2ffd0
00bb3130	str x21,[x19, #0x7660]
00bb3134	add x27,x27,x22
00bb3138	ldr x21,[sp, #0x50]
00bb313c	stur x27,[x29, #-0x28]
00bb3140	b 0x00bb2f48
00bb3144	mov w8,#0x74e8
00bb3148	ldr x8,[x19, x8#0x0]
00bb314c	cmn x8,#0x1
00bb3150	b.eq 0x00bb3190
00bb3154	ldr w9,[x23, #0x4]
00bb3158	cmp w9,#0x1
00bb315c	b.eq 0x00bb3190
00bb3160	sub x28,x26,x24
00bb3164	cmp x28,x8
00bb3168	b.cc 0x00bb3190
00bb316c	ldr x21,[sp, #0x10]
00bb3170	ldr w2,[x23, #0xa0]
00bb3174	sub x8,x29,#0x20
00bb3178	ldr x0,[sp, #0x48]
00bb317c	mov x1,x21
00bb3180	bl 0x00bb04a4
00bb3184	ldur x27,[x29, #-0x18]
00bb3188	cmp x27,x21
00bb318c	b.ls 0x00bb382c
00bb3190	ldr w8,[x23, #0x178]
00bb3194	ldr x21,[sp, #0x50]
00bb3198	cmp w8,#0x1
00bb319c	b.ne 0x00bb31c8
00bb31a0	ldr w8,[x23, #0x4]
00bb31a4	cmp w8,#0x1
00bb31a8	b.eq 0x00bb31c8
00bb31ac	mov w8,#0x74e8
00bb31b0	ldr x8,[x19, x8#0x0]
00bb31b4	cmn x8,#0x1
00bb31b8	b.eq 0x00bb31c8
00bb31bc	sub x9,x26,x24
00bb31c0	cmp x9,x8
00bb31c4	b.cc 0x00bb3824
00bb31c8	ldr w8,[x23, #0x108]
00bb31cc	cmn w8,#0x1
00bb31d0	b.eq 0x00bb31e8
00bb31d4	cmp w8,#0x1
00bb31d8	b.ne 0x00bb31f0
00bb31dc	ldr x1,[x19, #0x75f0]
00bb31e0	str wzr,[x23, #0x108]
00bb31e4	b 0x00bb3208
00bb31e8	ldr x1,[x19, #0x75f0]
00bb31ec	b 0x00bb3208
00bb31f0	ldr x22,[sp, #0x28]
00bb31f4	ldr x0,[x22]
00bb31f8	bl 0x00c435b0
00bb31fc	mov x1,xzr
00bb3200	str wzr,[x23, #0x108]
00bb3204	stp xzr,xzr,[x22]
00bb3208	mov x0,x19
00bb320c	bl 0x00c43600
00bb3210	ldr w8,[x23, #0xa0]
00bb3214	cbnz w8,0x00bb3240
00bb3218	ldur x8,[x29, #-0x38]
00bb321c	mov w9,#0xd2a5
00bb3220	movk w9,#0x184, LSL #16
00bb3224	ldr w8,[x8]
00bb3228	cmp w9,w8, LSR #0x4
00bb322c	b.ne 0x00bb3240
00bb3230	ldur x8,[x29, #-0x38]
00bb3234	mov w9,#0x7
00bb3238	ldr w8,[x8, #0x4]
00bb323c	b 0x00bb3260
00bb3240	ldr x2,[x19, #0x7660]
00bb3244	ldur x1,[x29, #-0x38]
00bb3248	mov x0,x19
00bb324c	bl 0x00bb14e4
00bb3250	cmn x0,#0x78
00bb3254	b.hi 0x00bb3618
00bb3258	mov w9,#0x2
00bb325c	mov w8,#0x3
00bb3260	ldr x10,[x19, #0x74f0]
00bb3264	ldr x11,[x19, #0x7638]
00bb3268	str x8,[x19, #0x74e0]
00bb326c	mov w8,#0x400
00bb3270	str w9,[x23, #0x34]
00bb3274	cmp x10,#0x400
00bb3278	csel x8,x10,x8,hi
00bb327c	cmp x8,x11
00bb3280	str x8,[x19, #0x74f0]
00bb3284	b.hi 0x00bb37bc
00bb3288	ldr w10,[x23, #0x120]
00bb328c	ldr w9,[x23]
00bb3290	cbz w10,0x00bb32a0
00bb3294	cmp w9,w10
00bb3298	csel w9,w9,w10,cc
00bb329c	str w9,[x23]
00bb32a0	ldr w10,[x23, #0x178]
00bb32a4	cmp w9,#0x4
00bb32a8	mov w11,#0x4
00bb32ac	csel w22,w9,w11,hi
00bb32b0	cbz w10,0x00bb32bc
00bb32b4	mov x28,xzr
00bb32b8	b 0x00bb32ec
00bb32bc	mov w9,w9
00bb32c0	mov w10,#0x20000
00bb32c4	cmp x8,x9
00bb32c8	csel x9,x8,x9,cc
00bb32cc	cmp x9,#0x20, LSL #12
00bb32d0	csel x9,x9,x10,cc
00bb32d4	add x8,x8,x9, LSL #0x1
00bb32d8	mov w9,#0x74e8
00bb32dc	ldr x9,[x19, x9#0x0]
00bb32e0	add x8,x8,#0x40
00bb32e4	cmp x9,x8
00bb32e8	csel x28,x9,x8,cc
00bb32ec	ldr x9,[x19, #0x7628]
00bb32f0	ldr x8,[x19, #0x7648]
00bb32f4	add x27,x28,x22
00bb32f8	add x10,x27,x27, LSL #0x1
00bb32fc	add x11,x8,x9
00bb3300	cmp x11,x10
00bb3304	b.cs 0x00bb3314
00bb3308	ldur x11,[x29, #-0x38]
00bb330c	mov x10,xzr
00bb3310	b 0x00bb3320
00bb3314	ldur x11,[x29, #-0x38]
00bb3318	ldur x10,[x11, #0x14]
00bb331c	add x10,x10,#0x1
00bb3320	cmp x9,x22
00bb3324	stur x10,[x11, #0x14]
00bb3328	b.cs 0x00bb3350
00bb332c	ldr x8,[x19, #0x75d8]
00bb3330	cbz x8,0x00bb3364
00bb3334	mov x9,#-0x76e8
00bb3338	movk x9,#0xfffe, LSL #16
00bb333c	add x8,x8,x9
00bb3340	cmp x27,x8
00bb3344	b.hi 0x00bb37c4
00bb3348	ldr x0,[x19, #0x7620]
00bb334c	b 0x00bb33b8
00bb3350	cmp x8,x28
00bb3354	b.cc 0x00bb332c
00bb3358	cmp x10,#0x80
00bb335c	b.cc 0x00bb33c8
00bb3360	b 0x00bb332c
00bb3364	ldr x1,[x19, #0x7620]
00bb3368	cbz x1,0x00bb3388
00bb336c	ldr x8,[x19, #0x75b8]
00bb3370	cbz x8,0x00bb3380
00bb3374	ldr x0,[x19, #0x75c0]
00bb3378	blr x8
00bb337c	b 0x00bb3388
00bb3380	mov x0,x1
00bb3384	bl 0x00c30960
00bb3388	ldr x8,[x19, #0x75b0]
00bb338c	str xzr,[x19, #0x7628]
00bb3390	str xzr,[x19, #0x7648]
00bb3394	cbz x8,0x00bb33a8
00bb3398	ldr x0,[x19, #0x75c0]
00bb339c	mov x1,x27
00bb33a0	blr x8
00bb33a4	b 0x00bb33b0
00bb33a8	mov x0,x27
00bb33ac	bl 0x00c308d0
00bb33b0	str x0,[x19, #0x7620]
00bb33b4	cbz x0,0x00bb37c4
00bb33b8	add x8,x0,x22
00bb33bc	str x22,[x19, #0x7628]
00bb33c0	str x8,[x19, #0x7640]
00bb33c4	str x28,[x19, #0x7648]
00bb33c8	mov w8,#0x2
00bb33cc	str w8,[x23, #0x124]
00bb33d0	ldr w22,[x23, #0x34]
00bb33d4	sub w8,w22,#0x3
00bb33d8	cmp w8,#0x2
00bb33dc	ldp x8,x10,[x29, #-0x30]
00bb33e0	sub x8,x8,x10
00bb33e4	b.cs 0x00bb3408
00bb33e8	ldr w9,[x23, #0x30]
00bb33ec	ldr x4,[x19, #0x74e0]
00bb33f0	cbnz w9,0x00bb340c
00bb33f4	cmp x8,x4
00bb33f8	csel x9,x8,x4,cc
00bb33fc	cmp x9,#0x1
00bb3400	csinc x27,x9,xzr,hi
00bb3404	b 0x00bb3414
00bb3408	ldr x4,[x19, #0x74e0]
00bb340c	mov x27,x4
00bb3410	cbz x4,0x00bb3768
00bb3414	cmp x8,x27
00bb3418	b.cs 0x00bb34fc
00bb341c	ldur x8,[x29, #-0x30]
00bb3420	cmp x10,x8
00bb3424	b.eq 0x00bb37ac
00bb3428	mov w8,#0x3
00bb342c	str w8,[x23, #0x124]
00bb3430	ldr x8,[x19, #0x7630]
00bb3434	cmp w22,#0x7
00bb3438	sub x22,x4,x8
00bb343c	b.ne 0x00bb3458
00bb3440	ldur x9,[x29, #-0x30]
00bb3444	sub x9,x9,x10
00bb3448	cmp x22,x9
00bb344c	csel x27,x22,x9,cc
00bb3450	cbnz x27,0x00bb34a8
00bb3454	b 0x00bb34b4
00bb3458	ldr x9,[x19, #0x7628]
00bb345c	sub x9,x9,x8
00bb3460	cmp x22,x9
00bb3464	b.hi 0x00bb37a4
00bb3468	ldur x9,[x29, #-0x30]
00bb346c	sub x9,x9,x10
00bb3470	cmp x22,x9
00bb3474	csel x27,x22,x9,cc
00bb3478	cbz x27,0x00bb34b4
00bb347c	ldr x9,[x19, #0x7620]
00bb3480	mov x1,x10
00bb3484	mov x2,x27
00bb3488	mov x28,x21
00bb348c	mov x21,x4
00bb3490	add x0,x9,x8
00bb3494	bl 0x00c2ffd0
00bb3498	ldur x10,[x29, #-0x28]
00bb349c	ldr x8,[x19, #0x7630]
00bb34a0	mov x4,x21
00bb34a4	mov x21,x28
00bb34a8	add x8,x8,x27
00bb34ac	add x10,x10,x27
00bb34b0	str x8,[x19, #0x7630]
00bb34b4	cmp x27,x22
00bb34b8	b.cc 0x00bb37b0
00bb34bc	ldr w8,[x23, #0x178]
00bb34c0	ldr x3,[x19, #0x7620]
00bb34c4	ldr w22,[x23, #0x34]
00bb34c8	str xzr,[x19, #0x7630]
00bb34cc	stur x10,[x29, #-0x28]
00bb34d0	cbz w8,0x00bb3534
00bb34d4	sub x8,x26,x24
00bb34d8	cmp w22,#0x7
00bb34dc	mov x0,x19
00bb34e0	csel x2,xzr,x8,eq
00bb34e4	mov x1,x24
00bb34e8	bl 0x00c436a0
00bb34ec	cmn x0,#0x78
00bb34f0	b.hi 0x00bb3618
00bb34f4	add x24,x24,x0
00bb34f8	b 0x00bb3578
00bb34fc	ldr w8,[x23, #0x178]
00bb3500	cbz w8,0x00bb359c
00bb3504	sub x8,x26,x24
00bb3508	cmp w22,#0x7
00bb350c	mov x0,x19
00bb3510	csel x2,xzr,x8,eq
00bb3514	mov x1,x24
00bb3518	mov x3,x10
00bb351c	mov x4,x27
00bb3520	bl 0x00c436a0
00bb3524	cmn x0,#0x78
00bb3528	b.hi 0x00bb3618
00bb352c	add x24,x24,x0
00bb3530	b 0x00bb35e8
00bb3534	cmp w22,#0x7
00bb3538	b.ne 0x00bb3548
00bb353c	ldr x8,[x25]
00bb3540	mov x2,xzr
00bb3544	b 0x00bb3554
00bb3548	ldr x9,[x19, #0x7648]
00bb354c	ldr x8,[x19, #0x7650]
00bb3550	sub x2,x9,x8
00bb3554	ldr x9,[x19, #0x7640]
00bb3558	mov x0,x19
00bb355c	add x1,x9,x8
00bb3560	bl 0x00c436a0
00bb3564	cmn x0,#0x78
00bb3568	b.hi 0x00bb3618
00bb356c	cmp w22,#0x7
00bb3570	b.eq 0x00bb3584
00bb3574	cbnz x0,0x00bb3584
00bb3578	mov w8,#0x2
00bb357c	str w8,[x23, #0x124]
00bb3580	b 0x00bb2f48
00bb3584	ldr x8,[x19, #0x7650]
00bb3588	add x8,x8,x0
00bb358c	str x8,[x19, #0x7658]
00bb3590	mov w8,#0x4
00bb3594	str w8,[x23, #0x124]
00bb3598	b 0x00bb2f48
00bb359c	cmp w22,#0x7
00bb35a0	b.ne 0x00bb35b0
00bb35a4	ldr x8,[x25]
00bb35a8	mov x2,xzr
00bb35ac	b 0x00bb35bc
00bb35b0	ldr x9,[x19, #0x7648]
00bb35b4	ldr x8,[x19, #0x7650]
00bb35b8	sub x2,x9,x8
00bb35bc	ldr x9,[x19, #0x7640]
00bb35c0	mov x0,x19
00bb35c4	mov x3,x10
00bb35c8	mov x4,x27
00bb35cc	add x1,x9,x8
00bb35d0	bl 0x00c436a0
00bb35d4	cmn x0,#0x78
00bb35d8	b.hi 0x00bb3618
00bb35dc	cmp w22,#0x7
00bb35e0	b.eq 0x00bb3600
00bb35e4	cbnz x0,0x00bb3600
00bb35e8	mov w8,#0x2
00bb35ec	ldur x9,[x29, #-0x28]
00bb35f0	str w8,[x23, #0x124]
00bb35f4	add x9,x9,x27
00bb35f8	stur x9,[x29, #-0x28]
00bb35fc	b 0x00bb2f48
00bb3600	ldr x8,[x19, #0x7650]
00bb3604	add x8,x8,x0
00bb3608	str x8,[x19, #0x7658]
00bb360c	mov w8,#0x4
00bb3610	b 0x00bb35ec
00bb3614	mov x0,#-0x1
00bb3618	ldur x22,[x29, #-0x40]
00bb361c	b 0x00bb36bc
00bb3620	ldur x22,[x29, #-0x40]
00bb3624	ldr x25,[sp, #0x48]
00bb3628	ldur x10,[x29, #-0x28]
00bb362c	ldr x8,[x20]
00bb3630	ldur x9,[x29, #-0x48]
00bb3634	cmp x10,x25
00bb3638	sub x8,x10,x8
00bb363c	str x8,[x20, #0x10]
00bb3640	ldr x8,[x21]
00bb3644	ldr q0,[x21]
00bb3648	sub x8,x24,x8
00bb364c	str x8,[x21, #0x10]
00bb3650	str x8,[x9, #0x10]
00bb3654	str q0,[x9]
00bb3658	b.ne 0x00bb3690
00bb365c	ldr x8,[sp, #0x40]
00bb3660	cmp x24,x8
00bb3664	b.ne 0x00bb3690
00bb3668	ldr w8,[x23, #0x174]
00bb366c	add w9,w8,#0x1
00bb3670	cmp w8,#0xf
00bb3674	str w9,[x23, #0x174]
00bb3678	b.lt 0x00bb3694
00bb367c	ldp x9,x8,[sp, #0x30]
00bb3680	cmp x8,x9
00bb3684	b.ne 0x00bb373c
00bb3688	mov x0,#-0x50
00bb368c	b 0x00bb36bc
00bb3690	str wzr,[x23, #0x174]
00bb3694	ldr x21,[x19, #0x74e0]
00bb3698	cbz x21,0x00bb36ec
00bb369c	mov x0,x19
00bb36a0	bl 0x00c43690
00bb36a4	ldr x8,[x19, #0x7630]
00bb36a8	cmp w0,#0x2
00bb36ac	mov w9,#0x3
00bb36b0	csel x9,x9,xzr,eq
00bb36b4	sub x8,x21,x8
00bb36b8	add x0,x8,x9
00bb36bc	ldr x8,[x22, #0x28]
00bb36c0	ldur x9,[x29, #-0x8]
00bb36c4	cmp x8,x9
00bb36c8	b.ne 0x00bb3884
00bb36cc	ldp x20,x19,[sp, #0xf0]
00bb36d0	ldp x22,x21,[sp, #0xe0]
00bb36d4	ldp x24,x23,[sp, #0xd0]
00bb36d8	ldp x26,x25,[sp, #0xc0]
00bb36dc	ldp x28,x27,[sp, #0xb0]
00bb36e0	ldp x29,x30,[sp, #0xa0]
00bb36e4	add sp,sp,#0x100
00bb36e8	ret
00bb36ec	ldr x9,[x19, #0x7658]
00bb36f0	ldr x10,[x19, #0x7650]
00bb36f4	ldr w8,[x23, #0x170]
00bb36f8	cmp x9,x10
00bb36fc	b.ne 0x00bb3720
00bb3700	cbz w8,0x00bb3750
00bb3704	ldp x9,x8,[x20, #0x8]
00bb3708	cmp x8,x9
00bb370c	b.cs 0x00bb3758
00bb3710	add x8,x8,#0x1
00bb3714	mov x0,xzr
00bb3718	str x8,[x20, #0x10]
00bb371c	b 0x00bb36bc
00bb3720	mov w0,#0x1
00bb3724	cbnz w8,0x00bb36bc
00bb3728	ldr x8,[x20, #0x10]
00bb372c	sub x8,x8,#0x1
00bb3730	str x8,[x20, #0x10]
00bb3734	str w0,[x23, #0x170]
00bb3738	b 0x00bb36bc
00bb373c	ldp x9,x8,[sp, #0x18]
00bb3740	cmp x9,x8
00bb3744	b.ne 0x00bb3694
00bb3748	mov x0,#-0x52
00bb374c	b 0x00bb36bc
00bb3750	mov x0,xzr
00bb3754	b 0x00bb36bc
00bb3758	mov w8,#0x2
00bb375c	mov w0,#0x1
00bb3760	str w8,[x23, #0x124]
00bb3764	b 0x00bb36bc
00bb3768	ldur x22,[x29, #-0x40]
00bb376c	ldr x25,[sp, #0x48]
00bb3770	str wzr,[x23, #0x124]
00bb3774	b 0x00bb362c
00bb3778	ldur x8,[x29, #-0x30]
00bb377c	cmp x8,x1
00bb3780	b.eq 0x00bb37cc
00bb3784	ldur x24,[x29, #-0x38]
00bb3788	mov x2,x28
00bb378c	add x0,x24,x27
00bb3790	bl 0x00c2ffd0
00bb3794	ldur x22,[x29, #-0x40]
00bb3798	add x27,x27,x28
00bb379c	str x27,[x19, #0x7660]
00bb37a0	b 0x00bb37d0
00bb37a4	mov x0,#-0x14
00bb37a8	b 0x00bb3618
00bb37ac	ldur x10,[x29, #-0x30]
00bb37b0	ldur x22,[x29, #-0x40]
00bb37b4	ldr x25,[sp, #0x48]
00bb37b8	b 0x00bb362c
00bb37bc	mov x0,#-0x10
00bb37c0	b 0x00bb3618
00bb37c4	mov x0,#-0x40
00bb37c8	b 0x00bb3618
00bb37cc	ldp x22,x24,[x29, #-0x40]
00bb37d0	ldr x8,[x20, #0x8]
00bb37d4	mov x1,x24
00bb37d8	mov x2,x27
00bb37dc	str x8,[x20, #0x10]
00bb37e0	mov w8,#0x74e8
00bb37e4	ldr w3,[x23, #0xa0]
00bb37e8	add x0,x19,x8
00bb37ec	bl 0x00c435f0
00bb37f0	cmn x0,#0x78
00bb37f4	b.hi 0x00bb36bc
00bb37f8	ldr w8,[x23, #0xa0]
00bb37fc	mov w9,#0x6
00bb3800	cmp w8,#0x0
00bb3804	mov w8,#0x2
00bb3808	csel x8,x9,x8,eq
00bb380c	ldr x9,[x19, #0x7660]
00bb3810	cmp x8,x21
00bb3814	csel x8,x8,x21,hi
00bb3818	sub x8,x8,x9
00bb381c	add x0,x8,#0x3
00bb3820	b 0x00bb36bc
00bb3824	mov x0,#-0x46
00bb3828	b 0x00bb3618
00bb382c	mov x0,x19
00bb3830	bl 0x00bb0da8
00bb3834	ldr x25,[sp, #0x48]
00bb3838	mov x7,x0
00bb383c	mov x0,x19
00bb3840	mov x1,x24
00bb3844	mov x2,x28
00bb3848	mov x4,x27
00bb384c	mov x3,x25
00bb3850	mov x5,xzr
00bb3854	mov x6,xzr
00bb3858	bl 0x00bb0774
00bb385c	ldur x22,[x29, #-0x40]
00bb3860	ldr x21,[sp, #0x50]
00bb3864	cmn x0,#0x78
00bb3868	b.hi 0x00bb36bc
00bb386c	add x8,x24,x0
00bb3870	cmp x24,#0x0
00bb3874	add x10,x25,x27
00bb3878	csel x24,xzr,x8,eq
00bb387c	str xzr,[x19, #0x74e0]
00bb3880	b 0x00bb3770
00bb3884	bl 0x00c2fec0
