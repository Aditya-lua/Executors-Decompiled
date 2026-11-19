; PKCS5_v2_PBKDF2_keyivgen_ex @ 00a6b770
00a6b770	sub sp,sp,#0xd0
00a6b774	stp x28,x27,[sp, #0x70]
00a6b778	stp x26,x25,[sp, #0x80]
00a6b77c	stp x24,x23,[sp, #0x90]
00a6b780	stp x22,x21,[sp, #0xa0]
00a6b784	stp x20,x19,[sp, #0xb0]
00a6b788	stp x29,x30,[sp, #0xc0]
00a6b78c	add x29,sp,#0xc0
00a6b790	mov x23,x7
00a6b794	mov w21,w6
00a6b798	mov x19,x3
00a6b79c	mov w24,w2
00a6b7a0	mov x25,x1
00a6b7a4	mov x22,x0
00a6b7a8	bl 0x00c34b80
00a6b7ac	cbz x0,0x00a6b814
00a6b7b0	mov x0,x22
00a6b7b4	bl 0x00c3cca0
00a6b7b8	cmp w0,#0x41
00a6b7bc	b.cs 0x00a6ba84
00a6b7c0	mov w27,w0
00a6b7c4	bl 0x00c37e60
00a6b7c8	mov x1,x19
00a6b7cc	bl 0x00c37a80
00a6b7d0	mov x19,x0
00a6b7d4	cbz x0,0x00a6b854
00a6b7d8	mov x0,x22
00a6b7dc	bl 0x00c3cca0
00a6b7e0	tbnz w0,#0x1f,0x00a6b87c
00a6b7e4	mov w20,w0
00a6b7e8	ldr x0,[x19, #0x10]
00a6b7ec	cbz x0,0x00a6b7fc
00a6b7f0	bl 0x00c37580
00a6b7f4	cmp x0,w20, SXTW 
00a6b7f8	b.ne 0x00a6b8b4
00a6b7fc	ldr x8,[x19, #0x18]
00a6b800	cbz x8,0x00a6b8dc
00a6b804	ldr x0,[x8]
00a6b808	bl 0x00c37750
00a6b80c	mov w1,w0
00a6b810	b 0x00a6b8e0
00a6b814	bl 0x00c342a0
00a6b818	adrp x0,0x2aa000
00a6b81c	adrp x2,0x2b9000
00a6b820	add x0,x0,#0x1d8
00a6b824	add x2,x2,#0xe66
00a6b828	mov w1,#0xc3
00a6b82c	bl 0x00c342b0
00a6b830	orr w0,wzr,#0x6
00a6b834	mov w1,#0x83
00a6b838	mov x2,xzr
00a6b83c	bl 0x00c342c0
00a6b840	mov w21,wzr
00a6b844	mov w27,wzr
00a6b848	mov x19,xzr
00a6b84c	mov x26,xzr
00a6b850	b 0x00a6ba24
00a6b854	bl 0x00c342a0
00a6b858	adrp x0,0x2aa000
00a6b85c	adrp x2,0x2b9000
00a6b860	add x0,x0,#0x1d8
00a6b864	add x2,x2,#0xe66
00a6b868	mov w1,#0xce
00a6b86c	bl 0x00c342b0
00a6b870	orr w0,wzr,#0x6
00a6b874	mov w1,#0x72
00a6b878	b 0x00a6b8a0
00a6b87c	bl 0x00c342a0
00a6b880	adrp x0,0x2aa000
00a6b884	adrp x2,0x2b9000
00a6b888	add x0,x0,#0x1d8
00a6b88c	add x2,x2,#0xe66
00a6b890	mov w1,#0xd4
00a6b894	bl 0x00c342b0
00a6b898	orr w0,wzr,#0x6
00a6b89c	mov w1,#0x82
00a6b8a0	mov x2,xzr
00a6b8a4	bl 0x00c342c0
00a6b8a8	mov w21,wzr
00a6b8ac	mov x26,xzr
00a6b8b0	b 0x00a6ba24
00a6b8b4	bl 0x00c342a0
00a6b8b8	adrp x0,0x2aa000
00a6b8bc	adrp x2,0x2b9000
00a6b8c0	add x0,x0,#0x1d8
00a6b8c4	add x2,x2,#0xe66
00a6b8c8	mov w1,#0xdc
00a6b8cc	bl 0x00c342b0
00a6b8d0	orr w0,wzr,#0x6
00a6b8d4	mov w1,#0x7b
00a6b8d8	b 0x00a6b9dc
00a6b8dc	mov w1,#0xa3
00a6b8e0	mov w0,#0x1
00a6b8e4	add x3,sp,#0x2c
00a6b8e8	mov x2,xzr
00a6b8ec	mov x4,xzr
00a6b8f0	bl 0x00c3d080
00a6b8f4	cbz w0,0x00a6b9b8
00a6b8f8	ldr x27,[x29, #0x10]
00a6b8fc	bl 0x00c35250
00a6b900	ldr w0,[sp, #0x2c]
00a6b904	bl 0x00c324f0
00a6b908	mov x1,x0
00a6b90c	mov x0,x23
00a6b910	mov x2,x27
00a6b914	bl 0x00c357f0
00a6b918	mov x26,x0
00a6b91c	mov x28,x0
00a6b920	cbnz x0,0x00a6b938
00a6b924	ldr w0,[sp, #0x2c]
00a6b928	bl 0x00c324f0
00a6b92c	bl 0x00c35310
00a6b930	mov x28,x0
00a6b934	cbz x0,0x00a6ba64
00a6b938	bl 0x00c35240
00a6b93c	ldr x8,[x19]
00a6b940	ldr w9,[x8]
00a6b944	cmp w9,#0x4
00a6b948	b.ne 0x00a6b9f0
00a6b94c	ldr x8,[x8, #0x8]
00a6b950	ldr x0,[x19, #0x8]
00a6b954	ldr x9,[x8, #0x8]
00a6b958	ldr w8,[x8]
00a6b95c	str x9,[sp, #0x20]
00a6b960	str w8,[sp, #0x1c]
00a6b964	bl 0x00c37580
00a6b968	ldr x2,[sp, #0x20]
00a6b96c	ldr w3,[sp, #0x1c]
00a6b970	mov x4,x0
00a6b974	add x7,sp,#0x30
00a6b978	mov x0,x25
00a6b97c	mov w1,w24
00a6b980	mov x5,x28
00a6b984	mov w6,w20
00a6b988	stp x23,x27,[sp]
00a6b98c	bl 0x00a6b228
00a6b990	cbz w0,0x00a6ba1c
00a6b994	add x3,sp,#0x30
00a6b998	mov x0,x22
00a6b99c	mov x1,xzr
00a6b9a0	mov x2,xzr
00a6b9a4	mov x4,xzr
00a6b9a8	mov w5,w21
00a6b9ac	bl 0x00c34be0
00a6b9b0	mov w21,w0
00a6b9b4	b 0x00a6ba20
00a6b9b8	bl 0x00c342a0
00a6b9bc	adrp x0,0x2aa000
00a6b9c0	adrp x2,0x2b9000
00a6b9c4	add x0,x0,#0x1d8
00a6b9c8	add x2,x2,#0xe66
00a6b9cc	mov w1,#0xe6
00a6b9d0	bl 0x00c342b0
00a6b9d4	orr w0,wzr,#0x6
00a6b9d8	mov w1,#0x7d
00a6b9dc	mov x2,xzr
00a6b9e0	bl 0x00c342c0
00a6b9e4	mov w21,wzr
00a6b9e8	mov x26,xzr
00a6b9ec	b 0x00a6ba20
00a6b9f0	bl 0x00c342a0
00a6b9f4	adrp x0,0x2aa000
00a6b9f8	adrp x2,0x2b9000
00a6b9fc	add x0,x0,#0x1d8
00a6ba00	add x2,x2,#0xe66
00a6ba04	mov w1,#0xf6
00a6ba08	bl 0x00c342b0
00a6ba0c	orr w0,wzr,#0x6
00a6ba10	orr w1,wzr,#0x7e
00a6ba14	mov x2,xzr
00a6ba18	bl 0x00c342c0
00a6ba1c	mov w21,wzr
00a6ba20	mov w27,w20
00a6ba24	mov w1,w27
00a6ba28	add x0,sp,#0x30
00a6ba2c	bl 0x00c34750
00a6ba30	mov x0,x19
00a6ba34	bl 0x00c37e50
00a6ba38	mov x0,x26
00a6ba3c	bl 0x00c35800
00a6ba40	mov w0,w21
00a6ba44	ldp x29,x30,[sp, #0xc0]
00a6ba48	ldp x20,x19,[sp, #0xb0]
00a6ba4c	ldp x22,x21,[sp, #0xa0]
00a6ba50	ldp x24,x23,[sp, #0x90]
00a6ba54	ldp x26,x25,[sp, #0x80]
00a6ba58	ldp x28,x27,[sp, #0x70]
00a6ba5c	add sp,sp,#0xd0
00a6ba60	ret
00a6ba64	bl 0x00c35ed0
00a6ba68	bl 0x00c342a0
00a6ba6c	adrp x0,0x2aa000
00a6ba70	adrp x2,0x2b9000
00a6ba74	add x0,x0,#0x1d8
00a6ba78	add x2,x2,#0xe66
00a6ba7c	orr w1,wzr,#0xf0
00a6ba80	b 0x00a6b9d0
00a6ba84	adrp x0,0x2c9000
00a6ba88	adrp x1,0x2aa000
00a6ba8c	add x0,x0,#0x9ad
00a6ba90	add x1,x1,#0x1d8
00a6ba94	mov w2,#0xc7
00a6ba98	bl 0x00c3c240
