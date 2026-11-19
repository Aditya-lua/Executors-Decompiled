; BN_mod_exp_mont_word @ 00a1b6a8
00a1b6a8	sub sp,sp,#0x80
00a1b6ac	stp x24,x23,[sp, #0x40]
00a1b6b0	stp x22,x21,[sp, #0x50]
00a1b6b4	mov x24,x1
00a1b6b8	mov x22,x0
00a1b6bc	mov w1,#0x4
00a1b6c0	mov x0,x2
00a1b6c4	stp x28,x27,[sp, #0x20]
00a1b6c8	stp x26,x25,[sp, #0x30]
00a1b6cc	stp x20,x19,[sp, #0x60]
00a1b6d0	stp x29,x30,[sp, #0x70]
00a1b6d4	add x29,sp,#0x70
00a1b6d8	mov x20,x5
00a1b6dc	mov x19,x4
00a1b6e0	mov x23,x3
00a1b6e4	mov x25,x2
00a1b6e8	bl 0x00c38ce0
00a1b6ec	cbnz w0,0x00a1b700
00a1b6f0	mov w1,#0x4
00a1b6f4	mov x0,x23
00a1b6f8	bl 0x00c38ce0
00a1b6fc	cbz w0,0x00a1b758
00a1b700	bl 0x00c342a0
00a1b704	adrp x0,0x2c9000
00a1b708	adrp x2,0x2b4000
00a1b70c	add x0,x0,#0x65b
00a1b710	add x2,x2,#0x81
00a1b714	mov w1,#0x4a8
00a1b718	bl 0x00c342b0
00a1b71c	mov w1,#0x101
00a1b720	orr w0,wzr,#0x3
00a1b724	movk w1,#0xc, LSL #16
00a1b728	mov x2,xzr
00a1b72c	bl 0x00c342c0
00a1b730	mov w21,wzr
00a1b734	mov w0,w21
00a1b738	ldp x29,x30,[sp, #0x70]
00a1b73c	ldp x20,x19,[sp, #0x60]
00a1b740	ldp x22,x21,[sp, #0x50]
00a1b744	ldp x24,x23,[sp, #0x40]
00a1b748	ldp x26,x25,[sp, #0x30]
00a1b74c	ldp x28,x27,[sp, #0x20]
00a1b750	add sp,sp,#0x80
00a1b754	ret
00a1b758	mov x0,x23
00a1b75c	bl 0x00c38d10
00a1b760	cbz w0,0x00a1b958
00a1b764	ldr w8,[x23, #0x8]
00a1b768	cmp w8,#0x1
00a1b76c	b.ne 0x00a1b780
00a1b770	ldr x8,[x23]
00a1b774	ldr x8,[x8]
00a1b778	udiv x9,x24,x8
00a1b77c	msub x24,x9,x8,x24
00a1b780	mov x0,x25
00a1b784	bl 0x00c322f0
00a1b788	cbz w0,0x00a1b980
00a1b78c	cbz x24,0x00a1b990
00a1b790	mov w21,w0
00a1b794	mov x0,x19
00a1b798	bl 0x00c38a90
00a1b79c	mov x0,x19
00a1b7a0	bl 0x00c38a40
00a1b7a4	mov x26,x0
00a1b7a8	mov x0,x19
00a1b7ac	bl 0x00c38a40
00a1b7b0	str x0,[sp, #0x10]
00a1b7b4	cbz x0,0x00a1b9a0
00a1b7b8	str x20,[sp, #0x8]
00a1b7bc	cbz x20,0x00a1ba0c
00a1b7c0	cmp w21,#0x2
00a1b7c4	b.lt 0x00a1b9d8
00a1b7c8	sub w8,w21,#0x1
00a1b7cc	mov w9,#0x1
00a1b7d0	mov x28,x26
00a1b7d4	mov x1,x24
00a1b7d8	str w8,[sp, #0x1c]
00a1b7dc	mul x21,x1,x1
00a1b7e0	udiv x8,x21,x1
00a1b7e4	cmp x8,x1
00a1b7e8	b.ne 0x00a1b7f8
00a1b7ec	cbz w9,0x00a1b82c
00a1b7f0	mov w26,#0x1
00a1b7f4	b 0x00a1b88c
00a1b7f8	ldr x26,[sp, #0x8]
00a1b7fc	mov x0,x28
00a1b800	cbz w9,0x00a1b834
00a1b804	bl 0x00c37720
00a1b808	cbz w0,0x00a1ba00
00a1b80c	mov x0,x28
00a1b810	mov x1,x28
00a1b814	mov x2,x26
00a1b818	mov x3,x19
00a1b81c	bl 0x00c38dd0
00a1b820	cbz w0,0x00a1ba00
00a1b824	ldr x27,[sp, #0x10]
00a1b828	b 0x00a1b860
00a1b82c	ldp x26,x27,[sp, #0x8]
00a1b830	b 0x00a1b864
00a1b834	bl 0x00c37700
00a1b838	cbz w0,0x00a1ba00
00a1b83c	ldr x1,[sp, #0x10]
00a1b840	mov x0,xzr
00a1b844	mov x2,x28
00a1b848	mov x3,x23
00a1b84c	mov x4,x19
00a1b850	bl 0x00c38ab0
00a1b854	cbz w0,0x00a1ba00
00a1b858	mov x27,x28
00a1b85c	ldr x28,[sp, #0x10]
00a1b860	mov w21,#0x1
00a1b864	mov x0,x28
00a1b868	mov x1,x28
00a1b86c	mov x2,x28
00a1b870	mov x3,x26
00a1b874	mov x4,x19
00a1b878	bl 0x00c38d60
00a1b87c	mov w26,wzr
00a1b880	mov w9,wzr
00a1b884	str x27,[sp, #0x10]
00a1b888	cbz w0,0x00a1bacc
00a1b88c	ldr w1,[sp, #0x1c]
00a1b890	mov x0,x25
00a1b894	mov x27,x9
00a1b898	sub w1,w1,#0x1
00a1b89c	str w1,[sp, #0x1c]
00a1b8a0	bl 0x00c38d00
00a1b8a4	cbz w0,0x00a1b8bc
00a1b8a8	mul x8,x21,x24
00a1b8ac	udiv x9,x8,x24
00a1b8b0	cmp x9,x21
00a1b8b4	b.ne 0x00a1b8dc
00a1b8b8	mov x21,x8
00a1b8bc	mov x26,x28
00a1b8c0	mov x9,x27
00a1b8c4	ldr w8,[sp, #0x1c]
00a1b8c8	mov x28,x26
00a1b8cc	mov x1,x21
00a1b8d0	cmp w8,#0x0
00a1b8d4	b.gt 0x00a1b7dc
00a1b8d8	b 0x00a1b9e0
00a1b8dc	cbz w26,0x00a1b918
00a1b8e0	mov x0,x28
00a1b8e4	mov x1,x21
00a1b8e8	bl 0x00c37720
00a1b8ec	cbz w0,0x00a1bacc
00a1b8f0	ldr x2,[sp, #0x8]
00a1b8f4	mov x0,x28
00a1b8f8	mov x1,x28
00a1b8fc	mov x3,x19
00a1b900	bl 0x00c38dd0
00a1b904	mov w9,wzr
00a1b908	mov x21,x24
00a1b90c	mov x26,x28
00a1b910	cbnz w0,0x00a1b8c4
00a1b914	b 0x00a1bacc
00a1b918	mov x0,x28
00a1b91c	mov x1,x21
00a1b920	bl 0x00c37700
00a1b924	cbz w0,0x00a1bacc
00a1b928	ldr x26,[sp, #0x10]
00a1b92c	mov x0,xzr
00a1b930	mov x2,x28
00a1b934	mov x3,x23
00a1b938	mov x1,x26
00a1b93c	mov x4,x19
00a1b940	bl 0x00c38ab0
00a1b944	mov x21,x24
00a1b948	mov x9,x27
00a1b94c	str x28,[sp, #0x10]
00a1b950	cbnz w0,0x00a1b8c4
00a1b954	b 0x00a1bacc
00a1b958	bl 0x00c342a0
00a1b95c	adrp x0,0x2c9000
00a1b960	adrp x2,0x2b4000
00a1b964	add x0,x0,#0x65b
00a1b968	add x2,x2,#0x81
00a1b96c	mov w1,#0x4b0
00a1b970	bl 0x00c342b0
00a1b974	orr w0,wzr,#0x3
00a1b978	mov w1,#0x66
00a1b97c	b 0x00a1b728
00a1b980	mov w1,#0x1
00a1b984	mov x0,x23
00a1b988	bl 0x00c38c60
00a1b98c	cbz w0,0x00a1b9b0
00a1b990	mov x0,x22
00a1b994	bl 0x00c38e00
00a1b998	mov w21,#0x1
00a1b99c	b 0x00a1b734
00a1b9a0	mov x26,xzr
00a1b9a4	mov w21,wzr
00a1b9a8	cbnz x20,0x00a1bae0
00a1b9ac	b 0x00a1bad8
00a1b9b0	mov x0,x22
00a1b9b4	ldp x29,x30,[sp, #0x70]
00a1b9b8	ldp x20,x19,[sp, #0x60]
00a1b9bc	ldp x22,x21,[sp, #0x50]
00a1b9c0	ldp x24,x23,[sp, #0x40]
00a1b9c4	ldp x26,x25,[sp, #0x30]
00a1b9c8	ldp x28,x27,[sp, #0x20]
00a1b9cc	mov w1,#0x1
00a1b9d0	add sp,sp,#0x80
00a1b9d4	b 0x00c37720
00a1b9d8	mov w9,#0x1
00a1b9dc	mov x21,x24
00a1b9e0	cmp x21,#0x1
00a1b9e4	b.ne 0x00a1ba34
00a1b9e8	cbz w9,0x00a1baa4
00a1b9ec	mov w1,#0x1
00a1b9f0	mov x0,x22
00a1b9f4	bl 0x00c37720
00a1b9f8	ldr x26,[sp, #0x8]
00a1b9fc	cbnz w0,0x00a1bac0
00a1ba00	mov w21,wzr
00a1ba04	cbnz x20,0x00a1bae0
00a1ba08	b 0x00a1bad8
00a1ba0c	bl 0x00c38f80
00a1ba10	cbz x0,0x00a1ba64
00a1ba14	mov x1,x23
00a1ba18	mov x2,x19
00a1ba1c	str x0,[sp, #0x8]
00a1ba20	bl 0x00c38f90
00a1ba24	cbnz w0,0x00a1b7c0
00a1ba28	ldr x26,[sp, #0x8]
00a1ba2c	mov w21,wzr
00a1ba30	b 0x00a1bad8
00a1ba34	cbz w9,0x00a1ba70
00a1ba38	mov x0,x26
00a1ba3c	mov x1,x21
00a1ba40	bl 0x00c37720
00a1ba44	cbz w0,0x00a1bacc
00a1ba48	ldr x2,[sp, #0x8]
00a1ba4c	mov x0,x26
00a1ba50	mov x1,x26
00a1ba54	mov x3,x19
00a1ba58	bl 0x00c38dd0
00a1ba5c	cbnz w0,0x00a1baa4
00a1ba60	b 0x00a1bacc
00a1ba64	mov w21,wzr
00a1ba68	mov x26,xzr
00a1ba6c	b 0x00a1bad8
00a1ba70	mov x0,x26
00a1ba74	mov x1,x21
00a1ba78	bl 0x00c37700
00a1ba7c	cbz w0,0x00a1bacc
00a1ba80	ldr x21,[sp, #0x10]
00a1ba84	mov x0,xzr
00a1ba88	mov x2,x26
00a1ba8c	mov x3,x23
00a1ba90	mov x1,x21
00a1ba94	mov x4,x19
00a1ba98	bl 0x00c38ab0
00a1ba9c	mov x26,x21
00a1baa0	cbz w0,0x00a1bacc
00a1baa4	mov x1,x26
00a1baa8	ldr x26,[sp, #0x8]
00a1baac	mov x0,x22
00a1bab0	mov x3,x19
00a1bab4	mov x2,x26
00a1bab8	bl 0x00c38fb0
00a1babc	cbz w0,0x00a1ba00
00a1bac0	mov w21,#0x1
00a1bac4	cbnz x20,0x00a1bae0
00a1bac8	b 0x00a1bad8
00a1bacc	ldr x26,[sp, #0x8]
00a1bad0	mov w21,wzr
00a1bad4	cbnz x20,0x00a1bae0
00a1bad8	mov x0,x26
00a1badc	bl 0x00c38f70
00a1bae0	mov x0,x19
00a1bae4	bl 0x00c38a20
00a1bae8	b 0x00a1b734
