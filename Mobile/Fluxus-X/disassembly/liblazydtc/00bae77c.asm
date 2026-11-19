; FUN_00bae77c @ 00bae77c
00bae77c	sub sp,sp,#0x1e0
00bae780	stp x28,x27,[sp, #0x180]
00bae784	stp x26,x25,[sp, #0x190]
00bae788	stp x24,x23,[sp, #0x1a0]
00bae78c	stp x22,x21,[sp, #0x1b0]
00bae790	stp x20,x19,[sp, #0x1c0]
00bae794	stp x29,x30,[sp, #0x1d0]
00bae798	add x29,sp,#0x1d0
00bae79c	mrs x22,tpidr_el0
00bae7a0	ldr x8,[x22, #0x28]
00bae7a4	adrp x9,0x788000
00bae7a8	adrp x10,0x788000
00bae7ac	mov w21,w1
00bae7b0	mov w20,w0
00bae7b4	add x9,x9,#0x9e8
00bae7b8	add x10,x10,#0xaa8
00bae7bc	cmp w1,#0x0
00bae7c0	mov w0,#0x400
00bae7c4	mov w1,#0x1
00bae7c8	stur x8,[x29, #-0x60]
00bae7cc	csel x19,x10,x9,eq
00bae7d0	bl 0x00c30a30
00bae7d4	mov x24,x0
00bae7d8	cbz x0,0x00baebb8
00bae7dc	add x0,sp,#0x58
00bae7e0	mov w2,#0xd8
00bae7e4	mov w1,wzr
00bae7e8	str x22,[sp, #0x20]
00bae7ec	add x22,sp,#0x58
00bae7f0	bl 0x00c301c0
00bae7f4	mov x9,#0x9ed8
00bae7f8	mov x10,#0xc908
00bae7fc	mov x15,#0x5939
00bae800	mov x16,#0x36f1
00bae804	movk x9,#0xc105, LSL #16
00bae808	movk x10,#0xf3bc, LSL #16
00bae80c	movk x15,#0xf70e, LSL #16
00bae810	movk x16,#0x5f1d, LSL #16
00bae814	mov x17,#0xb31
00bae818	mov x18,#0x82d1
00bae81c	movk x9,#0x9d5d, LSL #32
00bae820	movk x10,#0xe667, LSL #32
00bae824	movk x15,#0xecd8, LSL #32
00bae828	movk x16,#0xf53a, LSL #32
00bae82c	movk x17,#0xffc0, LSL #16
00bae830	movk x18,#0xade6, LSL #16
00bae834	mov x0,#0x1511
00bae838	mov x1,#0x6c1f
00bae83c	cmp w21,#0x0
00bae840	movk x9,#0xcbbb, LSL #48
00bae844	movk x10,#0x6a09, LSL #48
00bae848	movk x15,#0x152f, LSL #48
00bae84c	movk x16,#0xa54f, LSL #48
00bae850	movk x17,#0x2667, LSL #32
00bae854	movk x18,#0x527f, LSL #32
00bae858	movk x0,#0x6858, LSL #16
00bae85c	movk x1,#0x2b3e, LSL #16
00bae860	mov x2,#0x8fa7
00bae864	mov x3,#0xbd6b
00bae868	mov x4,#0x4fa4
00bae86c	mov x5,#0x2179
00bae870	movk x17,#0x6733, LSL #48
00bae874	movk x18,#0x510e, LSL #48
00bae878	movk x0,#0x4a87, LSL #32
00bae87c	movk x1,#0x688c, LSL #32
00bae880	movk x2,#0x64f9, LSL #16
00bae884	movk x3,#0xfb41, LSL #16
00bae888	movk x4,#0xbefa, LSL #16
00bae88c	movk x5,#0x137e, LSL #16
00bae890	add x6,x22,#0x50
00bae894	csel x22,x10,x9,eq
00bae898	csel x10,x16,x15,eq
00bae89c	mov w8,#0x200
00bae8a0	mov x11,#0xd507
00bae8a4	mov x12,#0xa73b
00bae8a8	mov x13,#0xdd17
00bae8ac	mov x14,#0xf82b
00bae8b0	movk x0,#0x8eb4, LSL #48
00bae8b4	movk x1,#0x9b05, LSL #48
00bae8b8	movk x2,#0x2e0d, LSL #32
00bae8bc	movk x3,#0xd9ab, LSL #32
00bae8c0	movk x4,#0x481d, LSL #32
00bae8c4	movk x5,#0xcd19, LSL #32
00bae8c8	stp x10,x6,[sp, #0x48]
00bae8cc	csel x10,x18,x17,eq
00bae8d0	movk x11,#0x367c, LSL #16
00bae8d4	movk x12,#0x84ca, LSL #16
00bae8d8	movk x13,#0x3070, LSL #16
00bae8dc	movk x14,#0xfe94, LSL #16
00bae8e0	movk x2,#0xdb0c, LSL #48
00bae8e4	movk x3,#0x1f83, LSL #48
00bae8e8	movk x4,#0x47b5, LSL #48
00bae8ec	movk x5,#0x5be0, LSL #48
00bae8f0	str x10,[sp, #0x40]
00bae8f4	csel x10,x1,x0,eq
00bae8f8	sub w8,w8,w21, LSL #0x7
00bae8fc	movk x11,#0x292a, LSL #32
00bae900	movk x12,#0xae85, LSL #32
00bae904	movk x13,#0x15a, LSL #32
00bae908	movk x14,#0xf372, LSL #32
00bae90c	mov w9,#0x40
00bae910	str x10,[sp, #0x38]
00bae914	csel x10,x3,x2,eq
00bae918	str w8,[sp, #0x18]
00bae91c	csel x8,x5,x4,eq
00bae920	movk x11,#0x629a, LSL #48
00bae924	movk x12,#0xbb67, LSL #48
00bae928	movk x13,#0x9159, LSL #48
00bae92c	movk x14,#0x3c6e, LSL #48
00bae930	stp x8,x10,[sp, #0x28]
00bae934	sub w8,w9,w21, LSL #0x4
00bae938	mov x26,xzr
00bae93c	csel x25,x12,x11,eq
00bae940	csel x23,x14,x13,eq
00bae944	sxtw x8,w8
00bae948	stp x8,x19,[sp, #0x8]
00bae94c	str x22,[sp]
00bae950	cbz w20,0x00bae968
00bae954	ldr w1,[sp, #0x18]
00bae958	adrp x0,0x2d2000
00bae95c	add w2,w26,#0x1
00bae960	add x0,x0,#0x9fc
00bae964	bl 0x00c41af0
00bae968	cmp w21,#0x1
00bae96c	b.hi 0x00baec10
00bae970	ldr x8,[sp, #0x48]
00bae974	cmp x26,#0x2
00bae978	stp xzr,xzr,[sp, #0x58]
00bae97c	stp x22,x25,[sp, #0x68]
00bae980	stp x23,x8,[sp, #0x78]
00bae984	ldr x8,[sp, #0x40]
00bae988	str w21,[sp, #0x128]
00bae98c	str x8,[sp, #0x88]
00bae990	ldr x8,[sp, #0x38]
00bae994	str x8,[sp, #0x90]
00bae998	ldr x8,[sp, #0x30]
00bae99c	str x8,[sp, #0x98]
00bae9a0	ldr x8,[sp, #0x28]
00bae9a4	str x8,[sp, #0xa0]
00bae9a8	b.ne 0x00bae9cc
00bae9ac	mov w1,#0x61
00bae9b0	mov w2,#0x3e8
00bae9b4	mov x0,x24
00bae9b8	str w20,[sp, #0x1c]
00bae9bc	bl 0x00c301c0
00bae9c0	mov x9,xzr
00bae9c4	mov w22,wzr
00bae9c8	b 0x00baea30
00bae9cc	adrp x8,0x788000
00bae9d0	add x8,x8,#0xcc0
00bae9d4	ldr x27,[x8, x26, LSL #0x3]
00bae9d8	adrp x9,0x788000
00bae9dc	mov w8,#0x71
00bae9e0	add x9,x9,#0xb68
00bae9e4	madd x28,x26,x8,x9
00bae9e8	str x27,[sp, #0x58]
00bae9ec	cmp x27,#0x80
00bae9f0	b.cc 0x00baeb18
00bae9f4	mov x22,x27
00bae9f8	mov x19,x28
00bae9fc	add x0,sp,#0x58
00baea00	mov x1,x19
00baea04	bl 0x00c43500
00baea08	sub x22,x22,#0x80
00baea0c	cmp x22,#0x7f
00baea10	add x19,x19,#0x80
00baea14	b.hi 0x00bae9fc
00baea18	and x8,x27,#-0x80
00baea1c	add x28,x28,x8
00baea20	sub x27,x27,x8
00baea24	cbnz x8,0x00bae9ec
00baea28	b 0x00baec00
00baea2c	ldr x9,[sp, #0x58]
00baea30	mov x20,x23
00baea34	and w8,w9,#0x7f
00baea38	add x10,x9,#0x3e8
00baea3c	cmn x9,#0x3e8
00baea40	str x10,[sp, #0x58]
00baea44	b.cc 0x00baea54
00baea48	ldr x9,[sp, #0x60]
00baea4c	add x9,x9,#0x1
00baea50	str x9,[sp, #0x60]
00baea54	mov x23,x25
00baea58	cbz w8,0x00baeaa0
00baea5c	mov w9,#0x80
00baea60	sub w27,w9,w8
00baea64	add x9,sp,#0x58
00baea68	add x8,x9,x8
00baea6c	add x0,x8,#0x50
00baea70	mov x1,x24
00baea74	mov x2,x27
00baea78	bl 0x00c2ffd0
00baea7c	ldr x1,[sp, #0x50]
00baea80	add x0,sp,#0x58
00baea84	bl 0x00c43500
00baea88	mov w8,#0x3e8
00baea8c	add x19,x24,x27
00baea90	sub x25,x8,x27
00baea94	cmp x25,#0x80
00baea98	b.cs 0x00baeab0
00baea9c	b 0x00baeae8
00baeaa0	mov w25,#0x3e8
00baeaa4	mov x19,x24
00baeaa8	cmp x25,#0x80
00baeaac	b.cc 0x00baeae8
00baeab0	mov x28,x25
00baeab4	mov x27,x19
00baeab8	add x0,sp,#0x58
00baeabc	mov x1,x27
00baeac0	bl 0x00c43500
00baeac4	sub x28,x28,#0x80
00baeac8	cmp x28,#0x7f
00baeacc	add x27,x27,#0x80
00baead0	b.hi 0x00baeab8
00baead4	and x8,x25,#-0x80
00baead8	add x19,x19,x8
00baeadc	sub x25,x25,x8
00baeae0	cbnz x8,0x00baeaa8
00baeae4	b 0x00baeb84
00baeae8	cbz x25,0x00baeafc
00baeaec	ldr x0,[sp, #0x50]
00baeaf0	mov x1,x19
00baeaf4	mov x2,x25
00baeaf8	bl 0x00c2ffd0
00baeafc	mov x25,x23
00baeb00	mov x23,x20
00baeb04	ldr w20,[sp, #0x1c]
00baeb08	add w22,w22,#0x1
00baeb0c	cmp w22,#0x3e7
00baeb10	b.ls 0x00baea2c
00baeb14	b 0x00baeb2c
00baeb18	cbz x27,0x00baeb2c
00baeb1c	ldr x0,[sp, #0x50]
00baeb20	mov x1,x28
00baeb24	mov x2,x27
00baeb28	bl 0x00c2ffd0
00baeb2c	add x0,sp,#0x58
00baeb30	sub x1,x29,#0xa0
00baeb34	bl 0x00c42b60
00baeb38	ldp x2,x19,[sp, #0x8]
00baeb3c	sub x0,x29,#0xa0
00baeb40	add x1,x19,x26, LSL #0x6
00baeb44	bl 0x00c300b0
00baeb48	cbnz w0,0x00baec20
00baeb4c	cbz w20,0x00baeb5c
00baeb50	adrp x0,0x77c000
00baeb54	add x0,x0,#0x87c
00baeb58	bl 0x00c30760
00baeb5c	ldr x22,[sp]
00baeb60	add x26,x26,#0x1
00baeb64	cmp x26,#0x3
00baeb68	b.cc 0x00bae950
00baeb6c	cbz w20,0x00baeb78
00baeb70	mov w0,#0xa
00baeb74	bl 0x00c42240
00baeb78	ldr x22,[sp, #0x20]
00baeb7c	mov w21,wzr
00baeb80	b 0x00baeba0
00baeb84	ldr x22,[sp, #0x20]
00baeb88	ldr w20,[sp, #0x1c]
00baeb8c	mov w21,#0xffffffff
00baeb90	cbz w20,0x00baeba0
00baeb94	adrp x0,0x77c000
00baeb98	add x0,x0,#0x854
00baeb9c	bl 0x00c30760
00baeba0	add x0,sp,#0x58
00baeba4	mov w1,#0xd8
00baeba8	bl 0x00c42220
00baebac	mov x0,x24
00baebb0	bl 0x00c30960
00baebb4	b 0x00baebcc
00baebb8	cbz w20,0x00baebc8
00baebbc	adrp x0,0x746000
00baebc0	add x0,x0,#0x3e0
00baebc4	bl 0x00c30760
00baebc8	mov w21,#0x1
00baebcc	ldr x8,[x22, #0x28]
00baebd0	ldur x9,[x29, #-0x60]
00baebd4	cmp x8,x9
00baebd8	b.ne 0x00baec30
00baebdc	mov w0,w21
00baebe0	ldp x29,x30,[sp, #0x1d0]
00baebe4	ldp x20,x19,[sp, #0x1c0]
00baebe8	ldp x22,x21,[sp, #0x1b0]
00baebec	ldp x24,x23,[sp, #0x1a0]
00baebf0	ldp x26,x25,[sp, #0x190]
00baebf4	ldp x28,x27,[sp, #0x180]
00baebf8	add sp,sp,#0x1e0
00baebfc	ret
00baec00	mov w21,#0xffffffff
00baec04	ldr x22,[sp, #0x20]
00baec08	cbnz w20,0x00baeb94
00baec0c	b 0x00baeba0
00baec10	mov w21,#0xffffff8b
00baec14	ldr x22,[sp, #0x20]
00baec18	cbnz w20,0x00baeb94
00baec1c	b 0x00baeba0
00baec20	mov w21,#0x1
00baec24	ldr x22,[sp, #0x20]
00baec28	cbnz w20,0x00baeb94
00baec2c	b 0x00baeba0
00baec30	bl 0x00c2fec0
