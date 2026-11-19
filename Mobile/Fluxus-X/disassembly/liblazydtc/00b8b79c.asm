; psa_aead_encrypt @ 00b8b79c
00b8b79c	sub sp,sp,#0xc0
00b8b7a0	stp x28,x27,[sp, #0x60]
00b8b7a4	stp x26,x25,[sp, #0x70]
00b8b7a8	stp x24,x23,[sp, #0x80]
00b8b7ac	stp x22,x21,[sp, #0x90]
00b8b7b0	stp x20,x19,[sp, #0xa0]
00b8b7b4	stp x29,x30,[sp, #0xb0]
00b8b7b8	add x29,sp,#0xb0
00b8b7bc	mrs x19,tpidr_el0
00b8b7c0	ldr x28,[x29, #0x20]
00b8b7c4	ldr x8,[x19, #0x28]
00b8b7c8	and w9,w1,#0x7f000000
00b8b7cc	mov w10,#0x5000000
00b8b7d0	mov x23,x7
00b8b7d4	mov x26,x6
00b8b7d8	mov x21,x5
00b8b7dc	mov x25,x4
00b8b7e0	mov x22,x3
00b8b7e4	mov x20,x2
00b8b7e8	mov w24,w1
00b8b7ec	cmp w9,w10
00b8b7f0	str x8,[sp, #0x58]
00b8b7f4	str xzr,[x28]
00b8b7f8	b.ne 0x00b8b8dc
00b8b7fc	mov w9,#0x8ff
00b8b800	and w8,w24,#0xffffff00
00b8b804	movk w9,#0x600, LSL #16
00b8b808	cmp w8,w9
00b8b80c	b.gt 0x00b8b828
00b8b810	mov w9,#0x200
00b8b814	movk w9,#0x600, LSL #16
00b8b818	cmp w8,w9
00b8b81c	b.eq 0x00b8b85c
00b8b820	mov w9,#0x300
00b8b824	b 0x00b8b83c
00b8b828	mov w9,#0x900
00b8b82c	movk w9,#0x600, LSL #16
00b8b830	cmp w8,w9
00b8b834	b.eq 0x00b8b85c
00b8b838	mov w9,#0x1300
00b8b83c	movk w9,#0x600, LSL #16
00b8b840	cmp w8,w9
00b8b844	b.eq 0x00b8b85c
00b8b848	lsr w9,w24,#0x9
00b8b84c	orr w9,w9,#0x1
00b8b850	orr w10,wzr,#0x30003
00b8b854	cmp w9,w10
00b8b858	b.ne 0x00b8b88c
00b8b85c	ands w9,w24,#0xff
00b8b860	b.eq 0x00b8b88c
00b8b864	mov w10,#0x8ff
00b8b868	movk w10,#0x600, LSL #16
00b8b86c	cmp w8,w10
00b8b870	b.gt 0x00b8b894
00b8b874	mov w10,#0x200
00b8b878	movk w10,#0x600, LSL #16
00b8b87c	cmp w8,w10
00b8b880	b.eq 0x00b8b8c8
00b8b884	mov w10,#0x300
00b8b888	b 0x00b8b8a8
00b8b88c	tbz w24,#0xf,0x00b8b914
00b8b890	b 0x00b8b8dc
00b8b894	mov w10,#0x900
00b8b898	movk w10,#0x600, LSL #16
00b8b89c	cmp w8,w10
00b8b8a0	b.eq 0x00b8b8c8
00b8b8a4	mov w10,#0x1300
00b8b8a8	movk w10,#0x600, LSL #16
00b8b8ac	cmp w8,w10
00b8b8b0	b.eq 0x00b8b8c8
00b8b8b4	lsr w8,w24,#0x9
00b8b8b8	orr w8,w8,#0x1
00b8b8bc	orr w10,wzr,#0x30003
00b8b8c0	cmp w8,w10
00b8b8c4	b.ne 0x00b8b914
00b8b8c8	orr w8,w9,#0x2000000
00b8b8cc	mov w9,#0xff
00b8b8d0	movk w9,#0x200, LSL #16
00b8b8d4	cmp w8,w9
00b8b8d8	b.ne 0x00b8b914
00b8b8dc	mov w27,#0xffffff79
00b8b8e0	ldr x8,[x19, #0x28]
00b8b8e4	ldr x9,[sp, #0x58]
00b8b8e8	cmp x8,x9
00b8b8ec	b.ne 0x00b8bb58
00b8b8f0	mov w0,w27
00b8b8f4	ldp x29,x30,[sp, #0xb0]
00b8b8f8	ldp x20,x19,[sp, #0xa0]
00b8b8fc	ldp x22,x21,[sp, #0x90]
00b8b900	ldp x24,x23,[sp, #0x80]
00b8b904	ldp x26,x25,[sp, #0x70]
00b8b908	ldp x28,x27,[sp, #0x60]
00b8b90c	add sp,sp,#0xc0
00b8b910	ret
00b8b914	add x1,sp,#0x50
00b8b918	mov w2,#0x100
00b8b91c	mov w3,w24
00b8b920	bl 0x00b86e5c
00b8b924	mov w27,w0
00b8b928	cbnz w0,0x00b8b8e0
00b8b92c	cbz x22,0x00b8b9cc
00b8b930	mov w1,#0x1
00b8b934	mov x0,x22
00b8b938	bl 0x00c30a30
00b8b93c	cbz x0,0x00b8ba30
00b8b940	mov x1,x20
00b8b944	mov x2,x22
00b8b948	str x0,[sp, #0x48]
00b8b94c	bl 0x00c2ffd0
00b8b950	cbz x21,0x00b8b9d4
00b8b954	mov w1,#0x1
00b8b958	mov x0,x21
00b8b95c	bl 0x00c30a30
00b8b960	mov x20,x0
00b8b964	cbz x0,0x00b8ba3c
00b8b968	mov x0,x20
00b8b96c	mov x1,x25
00b8b970	mov x2,x21
00b8b974	bl 0x00c2ffd0
00b8b978	cbz x23,0x00b8b9dc
00b8b97c	mov w1,#0x1
00b8b980	mov x0,x23
00b8b984	bl 0x00c30a30
00b8b988	mov x25,x0
00b8b98c	cbz x0,0x00b8ba40
00b8b990	mov x0,x25
00b8b994	mov x1,x26
00b8b998	mov x2,x23
00b8b99c	str x20,[sp, #0x40]
00b8b9a0	bl 0x00c2ffd0
00b8b9a4	ldr x20,[x29, #0x18]
00b8b9a8	cbz x20,0x00b8b9ec
00b8b9ac	mov w1,#0x1
00b8b9b0	mov x0,x20
00b8b9b4	bl 0x00c30a30
00b8b9b8	mov x26,x0
00b8b9bc	cbz x0,0x00b8ba58
00b8b9c0	ldr x8,[x29, #0x10]
00b8b9c4	stp x8,x20,[sp, #0x30]
00b8b9c8	b 0x00b8b9f4
00b8b9cc	str xzr,[sp, #0x48]
00b8b9d0	cbnz x21,0x00b8b954
00b8b9d4	mov x20,xzr
00b8b9d8	cbnz x23,0x00b8b97c
00b8b9dc	str x20,[sp, #0x40]
00b8b9e0	mov x25,xzr
00b8b9e4	ldr x20,[x29, #0x18]
00b8b9e8	cbnz x20,0x00b8b9ac
00b8b9ec	stp xzr,xzr,[sp, #0x30]
00b8b9f0	mov x26,xzr
00b8b9f4	mov w9,#0x500
00b8b9f8	and w8,w24,#0xffc07fff
00b8b9fc	movk w9,#0x500, LSL #16
00b8ba00	cmp w8,w9
00b8ba04	b.eq 0x00b8ba68
00b8ba08	mov w9,#0x100
00b8ba0c	movk w9,#0x540, LSL #16
00b8ba10	cmp w8,w9
00b8ba14	b.eq 0x00b8ba80
00b8ba18	mov w9,#0x200
00b8ba1c	movk w9,#0x540, LSL #16
00b8ba20	cmp w8,w9
00b8ba24	b.ne 0x00b8bad0
00b8ba28	cbnz x22,0x00b8ba8c
00b8ba2c	b 0x00b8bad8
00b8ba30	mov x20,xzr
00b8ba34	mov x25,xzr
00b8ba38	b 0x00b8ba44
00b8ba3c	mov x25,xzr
00b8ba40	ldr x0,[sp, #0x48]
00b8ba44	mov x21,xzr
00b8ba48	mov x26,xzr
00b8ba4c	mov x22,xzr
00b8ba50	mov w27,#0xffffff73
00b8ba54	b 0x00b8bb0c
00b8ba58	mov x21,xzr
00b8ba5c	mov x22,xzr
00b8ba60	mov w27,#0xffffff73
00b8ba64	b 0x00b8bb08
00b8ba68	cmp x22,#0x8
00b8ba6c	mov w8,#0xffffff79
00b8ba70	cinc w27,w8,eq
00b8ba74	cmp x22,#0xc
00b8ba78	b.eq 0x00b8ba8c
00b8ba7c	b 0x00b8badc
00b8ba80	sub x8,x22,#0x7
00b8ba84	cmp x8,#0x7
00b8ba88	b.cs 0x00b8bad8
00b8ba8c	ldr x0,[sp, #0x50]
00b8ba90	ldr w8,[x0, #0x4]
00b8ba94	cmp w8,#0xff
00b8ba98	b.hi 0x00b8bae8
00b8ba9c	ldp x1,x2,[x0, #0x28]
00b8baa0	ldp x6,x4,[sp, #0x40]
00b8baa4	mov w3,w24
00b8baa8	mov x5,x22
00b8baac	mov x7,x21
00b8bab0	stp x20,x28,[sp, #0x18]
00b8bab4	stp x23,x26,[sp, #0x8]
00b8bab8	str x25,[sp]
00b8babc	bl 0x00c42de0
00b8bac0	mov w27,w0
00b8bac4	ldp x22,x21,[sp, #0x30]
00b8bac8	cbnz x20,0x00b8baf4
00b8bacc	b 0x00b8bb08
00b8bad0	mov w27,#0xffffff7a
00b8bad4	b 0x00b8badc
00b8bad8	mov w27,#0xffffff79
00b8badc	ldp x20,x0,[sp, #0x40]
00b8bae0	ldp x22,x21,[sp, #0x30]
00b8bae4	b 0x00b8bb0c
00b8bae8	mov w27,#0xffffff79
00b8baec	ldp x22,x21,[sp, #0x30]
00b8baf0	cbz x20,0x00b8bb08
00b8baf4	cbz w27,0x00b8bb08
00b8baf8	mov x0,x26
00b8bafc	mov w1,wzr
00b8bb00	mov x2,x20
00b8bb04	bl 0x00c301c0
00b8bb08	ldp x20,x0,[sp, #0x40]
00b8bb0c	bl 0x00c30960
00b8bb10	mov x0,x20
00b8bb14	bl 0x00c30960
00b8bb18	mov x0,x25
00b8bb1c	bl 0x00c30960
00b8bb20	cbz x26,0x00b8bb4c
00b8bb24	cbz x22,0x00b8bb48
00b8bb28	cbz x21,0x00b8bb3c
00b8bb2c	mov x0,x22
00b8bb30	mov x1,x26
00b8bb34	mov x2,x21
00b8bb38	bl 0x00c2ffd0
00b8bb3c	mov x0,x26
00b8bb40	bl 0x00c30960
00b8bb44	b 0x00b8bb4c
00b8bb48	mov w27,#0xffffff69
00b8bb4c	ldr x0,[sp, #0x50]
00b8bb50	bl 0x00c431e0
00b8bb54	b 0x00b8b8e0
00b8bb58	bl 0x00c2fec0
