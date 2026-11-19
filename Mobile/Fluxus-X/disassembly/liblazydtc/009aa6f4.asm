; ssl_encapsulate @ 009aa6f4
009aa6f4	sub sp,sp,#0x60
009aa6f8	stp x20,x19,[sp, #0x40]
009aa6fc	mov x20,x0
009aa700	stp x25,xzr,[sp, #0x10]
009aa704	stp x24,x23,[sp, #0x20]
009aa708	stp x22,x21,[sp, #0x30]
009aa70c	stp x29,x30,[sp, #0x50]
009aa710	add x29,sp,#0x50
009aa714	str xzr,[sp, #0x8]
009aa718	cbz x1,0x009aa83c
009aa71c	ldr x8,[x20, #0x9a8]
009aa720	mov x24,x2
009aa724	mov w25,w4
009aa728	mov x23,x3
009aa72c	ldr x0,[x8]
009aa730	ldr x2,[x8, #0x440]
009aa734	bl 0x00c34640
009aa738	mov x1,xzr
009aa73c	mov x19,x0
009aa740	bl 0x00c346d0
009aa744	cmp w0,#0x1
009aa748	b.lt 0x009aa7f8
009aa74c	add x2,sp,#0x8
009aa750	add x4,sp,#0x18
009aa754	mov x0,x19
009aa758	mov x1,xzr
009aa75c	mov x3,xzr
009aa760	bl 0x00c346c0
009aa764	cmp w0,#0x1
009aa768	b.lt 0x009aa7f8
009aa76c	ldr x0,[sp, #0x18]
009aa770	cbz x0,0x009aa7f8
009aa774	ldr x8,[sp, #0x8]
009aa778	cbz x8,0x009aa7f8
009aa77c	adrp x21,0x2a3000
009aa780	add x21,x21,#0xa43
009aa784	mov w2,#0x1336
009aa788	mov x1,x21
009aa78c	bl 0x00c32320
009aa790	ldr x8,[sp, #0x8]
009aa794	mov x22,x0
009aa798	mov w2,#0x1337
009aa79c	mov x1,x21
009aa7a0	mov x0,x8
009aa7a4	bl 0x00c32320
009aa7a8	mov x21,x0
009aa7ac	cbz x22,0x009aa878
009aa7b0	cbz x21,0x009aa878
009aa7b4	add x2,sp,#0x8
009aa7b8	add x4,sp,#0x18
009aa7bc	mov x0,x19
009aa7c0	mov x1,x21
009aa7c4	mov x3,x22
009aa7c8	bl 0x00c346c0
009aa7cc	cmp w0,#0x0
009aa7d0	b.le 0x009aa8a8
009aa7d4	cbz w25,0x009aa8e4
009aa7d8	ldr x2,[sp, #0x18]
009aa7dc	mov x0,x20
009aa7e0	mov x1,x22
009aa7e4	bl 0x009aa1fc
009aa7e8	mov w20,w0
009aa7ec	cmp w0,#0x1
009aa7f0	b.ge 0x009aa8f8
009aa7f4	b 0x009aa908
009aa7f8	bl 0x00c342a0
009aa7fc	adrp x0,0x2a3000
009aa800	adrp x2,0x2ab000
009aa804	add x0,x0,#0xa43
009aa808	add x2,x2,#0xaa3
009aa80c	mov w1,#0x1332
009aa810	bl 0x00c342b0
009aa814	mov w2,#0x103
009aa818	mov w1,#0x50
009aa81c	movk w2,#0xc, LSL #16
009aa820	mov x0,x20
009aa824	mov x3,xzr
009aa828	bl 0x00c34410
009aa82c	mov w20,wzr
009aa830	mov x22,xzr
009aa834	mov x21,xzr
009aa838	b 0x009aa908
009aa83c	bl 0x00c342a0
009aa840	adrp x0,0x2a3000
009aa844	adrp x2,0x2ab000
009aa848	add x0,x0,#0xa43
009aa84c	add x2,x2,#0xaa3
009aa850	mov w1,#0x1329
009aa854	bl 0x00c342b0
009aa858	mov w2,#0x103
009aa85c	mov w1,#0x50
009aa860	movk w2,#0xc, LSL #16
009aa864	mov x0,x20
009aa868	mov x3,xzr
009aa86c	bl 0x00c34410
009aa870	mov w20,wzr
009aa874	b 0x009aa93c
009aa878	bl 0x00c342a0
009aa87c	adrp x0,0x2a3000
009aa880	adrp x2,0x2ab000
009aa884	add x0,x0,#0xa43
009aa888	add x2,x2,#0xaa3
009aa88c	mov w1,#0x1339
009aa890	bl 0x00c342b0
009aa894	mov w8,#0x103
009aa898	movk w8,#0xc, LSL #16
009aa89c	sub w2,w8,#0x3
009aa8a0	mov w1,#0x50
009aa8a4	b 0x009aa8d0
009aa8a8	bl 0x00c342a0
009aa8ac	adrp x0,0x2a3000
009aa8b0	adrp x2,0x2ab000
009aa8b4	add x0,x0,#0xa43
009aa8b8	add x2,x2,#0xaa3
009aa8bc	mov w1,#0x133e
009aa8c0	bl 0x00c342b0
009aa8c4	mov w2,#0x103
009aa8c8	mov w1,#0x50
009aa8cc	movk w2,#0xc, LSL #16
009aa8d0	mov x0,x20
009aa8d4	mov x3,xzr
009aa8d8	bl 0x00c34410
009aa8dc	mov w20,wzr
009aa8e0	b 0x009aa908
009aa8e4	str x22,[x20, #0x360]
009aa8e8	ldr x8,[sp, #0x18]
009aa8ec	mov x22,xzr
009aa8f0	str x8,[x20, #0x368]
009aa8f4	mov w20,#0x1
009aa8f8	str x21,[x24]
009aa8fc	ldr x8,[sp, #0x8]
009aa900	mov x21,xzr
009aa904	str x8,[x23]
009aa908	ldr x1,[sp, #0x18]
009aa90c	adrp x23,0x2a3000
009aa910	add x23,x23,#0xa43
009aa914	mov w3,#0x1355
009aa918	mov x0,x22
009aa91c	mov x2,x23
009aa920	bl 0x00c345e0
009aa924	mov w2,#0x1356
009aa928	mov x0,x21
009aa92c	mov x1,x23
009aa930	bl 0x00c32310
009aa934	mov x0,x19
009aa938	bl 0x00c34620
009aa93c	mov w0,w20
009aa940	ldp x29,x30,[sp, #0x50]
009aa944	ldp x20,x19,[sp, #0x40]
009aa948	ldp x22,x21,[sp, #0x30]
009aa94c	ldp x24,x23,[sp, #0x20]
009aa950	ldr x25,[sp, #0x10]
009aa954	add sp,sp,#0x60
009aa958	ret
