; EVP_DecryptFinal_ex @ 00a5b77c
00a5b77c	str x21,[sp, #-0x30]!
00a5b780	stp x20,x19,[sp, #0x10]
00a5b784	stp x29,x30,[sp, #0x20]
00a5b788	add x29,sp,#0x20
00a5b78c	cbz x2,0x00a5b7cc
00a5b790	str wzr,[x2]
00a5b794	ldr w8,[x0, #0x10]
00a5b798	mov x19,x2
00a5b79c	mov x21,x0
00a5b7a0	cbz w8,0x00a5b810
00a5b7a4	bl 0x00c342a0
00a5b7a8	adrp x0,0x2a5000
00a5b7ac	adrp x2,0x2d7000
00a5b7b0	add x0,x0,#0xf9d
00a5b7b4	add x2,x2,#0xeac
00a5b7b8	mov w1,#0x3b4
00a5b7bc	bl 0x00c342b0
00a5b7c0	orr w0,wzr,#0x6
00a5b7c4	mov w1,#0x94
00a5b7c8	b 0x00a5b7f4
00a5b7cc	bl 0x00c342a0
00a5b7d0	adrp x0,0x2a5000
00a5b7d4	adrp x2,0x2d7000
00a5b7d8	add x0,x0,#0xf9d
00a5b7dc	add x2,x2,#0xeac
00a5b7e0	mov w1,#0x3ae
00a5b7e4	bl 0x00c342b0
00a5b7e8	mov w1,#0x102
00a5b7ec	orr w0,wzr,#0x6
00a5b7f0	movk w1,#0xc, LSL #16
00a5b7f4	mov x2,xzr
00a5b7f8	bl 0x00c342c0
00a5b7fc	mov w0,wzr
00a5b800	ldp x29,x30,[sp, #0x20]
00a5b804	ldp x20,x19,[sp, #0x10]
00a5b808	ldr x21,[sp], #0x30
00a5b80c	ret
00a5b810	ldr x8,[x21]
00a5b814	cbz x8,0x00a5b88c
00a5b818	ldr x9,[x8, #0x78]
00a5b81c	mov x20,x1
00a5b820	cbz x9,0x00a5b8dc
00a5b824	mov x0,x21
00a5b828	bl 0x00c36d40
00a5b82c	cmp w0,#0x1
00a5b830	b.lt 0x00a5b8b4
00a5b834	ldr x8,[x21]
00a5b838	ldr x9,[x8, #0xb0]
00a5b83c	cbz x9,0x00a5b8b4
00a5b840	ldr x8,[x21, #0xa8]
00a5b844	sxtw x10,w0
00a5b848	cmp w0,#0x1
00a5b84c	csel x3,xzr,x10,eq
00a5b850	add x2,sp,#0x8
00a5b854	mov x0,x8
00a5b858	mov x1,x20
00a5b85c	blr x9
00a5b860	cbz w0,0x00a5b800
00a5b864	ldr x8,[sp, #0x8]
00a5b868	lsr x9,x8,#0x1f
00a5b86c	cbz x9,0x00a5b984
00a5b870	bl 0x00c342a0
00a5b874	adrp x0,0x2a5000
00a5b878	adrp x2,0x2d7000
00a5b87c	add x0,x0,#0xf9d
00a5b880	add x2,x2,#0xeac
00a5b884	mov w1,#0x3cc
00a5b888	b 0x00a5b8cc
00a5b88c	bl 0x00c342a0
00a5b890	adrp x0,0x2a5000
00a5b894	adrp x2,0x2d7000
00a5b898	add x0,x0,#0xf9d
00a5b89c	add x2,x2,#0xeac
00a5b8a0	mov w1,#0x3b9
00a5b8a4	bl 0x00c342b0
00a5b8a8	orr w0,wzr,#0x6
00a5b8ac	mov w1,#0x83
00a5b8b0	b 0x00a5b7f4
00a5b8b4	bl 0x00c342a0
00a5b8b8	adrp x0,0x2a5000
00a5b8bc	adrp x2,0x2d7000
00a5b8c0	add x0,x0,#0xf9d
00a5b8c4	add x2,x2,#0xeac
00a5b8c8	mov w1,#0x3c3
00a5b8cc	bl 0x00c342b0
00a5b8d0	orr w0,wzr,#0x6
00a5b8d4	mov w1,#0xbc
00a5b8d8	b 0x00a5b7f4
00a5b8dc	str wzr,[x19]
00a5b8e0	ldrb w9,[x8, #0x12]
00a5b8e4	tbnz w9,#0x4,0x00a5b930
00a5b8e8	ldrb w9,[x21, #0x71]
00a5b8ec	tbnz w9,#0x0,0x00a5b954
00a5b8f0	ldr w11,[x8, #0x4]
00a5b8f4	mov w8,wzr
00a5b8f8	cmp w11,#0x2
00a5b8fc	b.cc 0x00a5ba6c
00a5b900	ldr w8,[x21, #0x14]
00a5b904	cbz w8,0x00a5b994
00a5b908	bl 0x00c342a0
00a5b90c	adrp x0,0x2a5000
00a5b910	adrp x2,0x2d7000
00a5b914	add x0,x0,#0xf9d
00a5b918	add x2,x2,#0xeac
00a5b91c	mov w1,#0x3ec
00a5b920	bl 0x00c342b0
00a5b924	orr w0,wzr,#0x6
00a5b928	mov w1,#0x6d
00a5b92c	b 0x00a5b7f4
00a5b930	ldr x8,[x8, #0x28]
00a5b934	mov x0,x21
00a5b938	mov x1,x20
00a5b93c	mov x2,xzr
00a5b940	mov x3,xzr
00a5b944	blr x8
00a5b948	tbnz w0,#0x1f,0x00a5b7fc
00a5b94c	str w0,[x19]
00a5b950	b 0x00a5ba70
00a5b954	ldr w8,[x21, #0x14]
00a5b958	cbz w8,0x00a5b98c
00a5b95c	bl 0x00c342a0
00a5b960	adrp x0,0x2a5000
00a5b964	adrp x2,0x2d7000
00a5b968	add x0,x0,#0xf9d
00a5b96c	add x2,x2,#0xeac
00a5b970	mov w1,#0x3e4
00a5b974	bl 0x00c342b0
00a5b978	orr w0,wzr,#0x6
00a5b97c	mov w1,#0x8a
00a5b980	b 0x00a5b7f4
00a5b984	str w8,[x19]
00a5b988	b 0x00a5b800
00a5b98c	str wzr,[x19]
00a5b990	b 0x00a5ba70
00a5b994	ldr w8,[x21, #0x80]
00a5b998	cbz w8,0x00a5b908
00a5b99c	cmp w11,#0x21
00a5b9a0	b.cs 0x00a5babc
00a5b9a4	sub w9,w11,#0x1
00a5b9a8	add x8,x21,x9
00a5b9ac	ldrb w10,[x8, #0x88]
00a5b9b0	cbz w10,0x00a5ba78
00a5b9b4	subs w8,w11,w10
00a5b9b8	b.lt 0x00a5ba78
00a5b9bc	mov w11,wzr
00a5b9c0	add x12,x21,w9, UXTW 
00a5b9c4	ldrb w12,[x12, #0x88]
00a5b9c8	cmp w12,w10
00a5b9cc	b.ne 0x00a5ba94
00a5b9d0	add w11,w11,#0x1
00a5b9d4	cmp w11,w10
00a5b9d8	sub w9,w9,#0x1
00a5b9dc	b.cc 0x00a5b9c0
00a5b9e0	cmp w8,#0x1
00a5b9e4	b.lt 0x00a5ba6c
00a5b9e8	mov x10,xzr
00a5b9ec	cmp w8,#0x20
00a5b9f0	mov w9,w8
00a5b9f4	b.cc 0x00a5ba4c
00a5b9f8	add x10,x21,x9
00a5b9fc	add x10,x10,#0x88
00a5ba00	cmp x10,x20
00a5ba04	b.ls 0x00a5ba1c
00a5ba08	add x10,x20,x9
00a5ba0c	add x11,x21,#0x88
00a5ba10	cmp x11,x10
00a5ba14	mov x10,xzr
00a5ba18	b.cc 0x00a5ba4c
00a5ba1c	and x10,x9,#0xffffffe0
00a5ba20	add x11,x21,#0x98
00a5ba24	add x12,x20,#0x10
00a5ba28	mov x13,x10
00a5ba2c	ldp q0,q1,[x11, #-0x10]
00a5ba30	add x11,x11,#0x20
00a5ba34	subs x13,x13,#0x20
00a5ba38	stp q0,q1,[x12, #-0x10]
00a5ba3c	add x12,x12,#0x20
00a5ba40	b.ne 0x00a5ba2c
00a5ba44	cmp x10,x9
00a5ba48	b.eq 0x00a5ba6c
00a5ba4c	add x12,x21,x10
00a5ba50	add x11,x20,x10
00a5ba54	add x12,x12,#0x88
00a5ba58	sub x9,x9,x10
00a5ba5c	ldrb w10,[x12], #0x1
00a5ba60	subs x9,x9,#0x1
00a5ba64	strb w10,[x11], #0x1
00a5ba68	b.ne 0x00a5ba5c
00a5ba6c	str w8,[x19]
00a5ba70	mov w0,#0x1
00a5ba74	b 0x00a5b800
00a5ba78	bl 0x00c342a0
00a5ba7c	adrp x0,0x2a5000
00a5ba80	adrp x2,0x2d7000
00a5ba84	add x0,x0,#0xf9d
00a5ba88	add x2,x2,#0xeac
00a5ba8c	mov w1,#0x3f7
00a5ba90	b 0x00a5baac
00a5ba94	bl 0x00c342a0
00a5ba98	adrp x0,0x2a5000
00a5ba9c	adrp x2,0x2d7000
00a5baa0	add x0,x0,#0xf9d
00a5baa4	add x2,x2,#0xeac
00a5baa8	orr w1,wzr,#0x3fc
00a5baac	bl 0x00c342b0
00a5bab0	orr w0,wzr,#0x6
00a5bab4	mov w1,#0x64
00a5bab8	b 0x00a5b7f4
00a5babc	adrp x0,0x2d9000
00a5bac0	adrp x1,0x2a5000
00a5bac4	add x0,x0,#0xc6b
00a5bac8	add x1,x1,#0xf9d
00a5bacc	mov w2,#0x3ef
00a5bad0	bl 0x00c3c240
