; do_ssl3_write @ 009cb2dc
009cb2dc	stp x28,x27,[sp, #-0x60]!
009cb2e0	stp x26,x25,[sp, #0x10]
009cb2e4	stp x24,x23,[sp, #0x20]
009cb2e8	stp x22,x21,[sp, #0x30]
009cb2ec	stp x20,x19,[sp, #0x40]
009cb2f0	stp x29,x30,[sp, #0x50]
009cb2f4	add x29,sp,#0x50
009cb2f8	sub sp,sp,#0x1, LSL #12
009cb2fc	sub sp,sp,#0x1a0
009cb300	mov x22,x6
009cb304	mov w21,w5
009cb308	mov x24,x4
009cb30c	mov x26,x3
009cb310	mov x23,x2
009cb314	mov w28,w1
009cb318	mov x19,x0
009cb31c	str xzr,[sp, #0x90]
009cb320	cbz x4,0x009cb398
009cb324	mov x8,xzr
009cb328	cmp x24,#0x4
009cb32c	mov x20,xzr
009cb330	b.cc 0x009cb374
009cb334	and x8,x24,#-0x4
009cb338	add x9,x26,#0x10
009cb33c	movi v0.2D,#0x0
009cb340	mov x10,x8
009cb344	movi v1.2D,#0x0
009cb348	ldp q2,q3,[x9, #-0x10]
009cb34c	subs x10,x10,#0x4
009cb350	add x9,x9,#0x20
009cb354	add v0.2D,v2.2D,v0.2D
009cb358	add v1.2D,v3.2D,v1.2D
009cb35c	b.ne 0x009cb348
009cb360	add v0.2D,v1.2D,v0.2D
009cb364	addp d0,v0.2D
009cb368	cmp x8,x24
009cb36c	fmov x20,d0
009cb370	b.eq 0x009cb38c
009cb374	add x9,x26,x8, LSL #0x3
009cb378	sub x8,x24,x8
009cb37c	ldr x10,[x9], #0x8
009cb380	subs x8,x8,#0x1
009cb384	add x20,x10,x20
009cb388	b.ne 0x009cb37c
009cb38c	ldr x8,[x19, #0xc70]
009cb390	cbnz x8,0x009cb3a4
009cb394	b 0x009cb3d0
009cb398	mov x20,xzr
009cb39c	ldr x8,[x19, #0xc70]
009cb3a0	cbz x8,0x009cb3d0
009cb3a4	orr w9,wzr,#0x30
009cb3a8	madd x9,x8,x9,x19
009cb3ac	ldr x9,[x9, #0xc98]
009cb3b0	cbz x9,0x009cb3d0
009cb3b4	mov x0,x19
009cb3b8	mov w1,w28
009cb3bc	mov x2,x23
009cb3c0	mov x3,x20
009cb3c4	mov x4,x22
009cb3c8	bl 0x009cb108
009cb3cc	b 0x009cbf9c
009cb3d0	ldr w9,[x19, #0x1a4]
009cb3d4	cbz w9,0x009cb3f4
009cb3d8	ldr x8,[x19, #0x8]
009cb3dc	mov x0,x19
009cb3e0	ldr x8,[x8, #0x78]
009cb3e4	blr x8
009cb3e8	cmp w0,#0x1
009cb3ec	b.lt 0x009cbf9c
009cb3f0	ldr x8,[x19, #0xc70]
009cb3f4	cmp x8,x24
009cb3f8	b.cs 0x009cb410
009cb3fc	mov x0,x19
009cb400	mov x1,x24
009cb404	mov x2,xzr
009cb408	bl 0x00c36d00
009cb40c	cbz w0,0x009cbf98
009cb410	cbnz w21,0x009cb41c
009cb414	mov w0,wzr
009cb418	cbz x20,0x009cbf9c
009cb41c	ldr x8,[x19, #0x918]
009cb420	cbz x8,0x009cb454
009cb424	ldr x8,[x19, #0x878]
009cb428	cbz x8,0x009cb454
009cb42c	ldr x0,[x19, #0x890]
009cb430	bl 0x00c34c00
009cb434	cbz x0,0x009cb454
009cb438	ldr x0,[x19, #0x890]
009cb43c	bl 0x00c34c00
009cb440	bl 0x00c34c20
009cb444	str x0,[sp, #0x70]
009cb448	tbnz w0,#0x1f,0x009cb4e4
009cb44c	mov w8,wzr
009cb450	b 0x009cb464
009cb454	ldr x8,[x19, #0x878]
009cb458	str xzr,[sp, #0x70]
009cb45c	cmp x8,#0x0
009cb460	cset w8,eq
009cb464	orr w8,w8,w21
009cb468	mov x25,xzr
009cb46c	cbnz w8,0x009cb50c
009cb470	ldr w8,[x19, #0x184]
009cb474	mov x25,xzr
009cb478	cbnz w8,0x009cb50c
009cb47c	cmp w28,#0x17
009cb480	b.ne 0x009cb500
009cb484	ldr w8,[x19, #0x180]
009cb488	mov x25,xzr
009cb48c	cbz w8,0x009cb504
009cb490	mov w1,#0x17
009cb494	add x3,sp,#0x98
009cb498	mov w4,#0x1
009cb49c	mov w5,#0x1
009cb4a0	add x6,sp,#0x90
009cb4a4	mov x0,x19
009cb4a8	mov x2,x23
009cb4ac	str xzr,[sp, #0x98]
009cb4b0	bl 0x009cb2dc
009cb4b4	cmp w0,#0x1
009cb4b8	b.lt 0x009cbf98
009cb4bc	ldr x25,[sp, #0x90]
009cb4c0	cmp x25,#0x56
009cb4c4	b.cc 0x009cb504
009cb4c8	bl 0x00c342a0
009cb4cc	adrp x0,0x2d3000
009cb4d0	adrp x2,0x29f000
009cb4d4	add x0,x0,#0x7fb
009cb4d8	add x2,x2,#0xe98
009cb4dc	mov w1,#0x304
009cb4e0	b 0x009cb63c
009cb4e4	bl 0x00c342a0
009cb4e8	adrp x0,0x2d3000
009cb4ec	adrp x2,0x29f000
009cb4f0	add x0,x0,#0x7fb
009cb4f4	add x2,x2,#0xe98
009cb4f8	mov w1,#0x2e3
009cb4fc	b 0x009cb63c
009cb500	mov x25,xzr
009cb504	mov w8,#0x1
009cb508	str w8,[x19, #0x184]
009cb50c	cbz w21,0x009cb568
009cb510	ldr x1,[x19, #0xca8]
009cb514	ldr x2,[x19, #0xcb8]
009cb518	add x0,sp,#0xa98
009cb51c	mov x3,xzr
009cb520	add w8,w1,#0x1
009cb524	mvn w8,w8
009cb528	and x20,x8,#0x7
009cb52c	str x20,[x19, #0xcc0]
009cb530	bl 0x00c34380
009cb534	cbz w0,0x009cb54c
009cb538	add x0,sp,#0xa98
009cb53c	mov x1,x20
009cb540	mov x2,xzr
009cb544	bl 0x00c36c40
009cb548	cbnz w0,0x009cb59c
009cb54c	bl 0x00c342a0
009cb550	adrp x0,0x2d3000
009cb554	adrp x2,0x29f000
009cb558	add x0,x0,#0x7fb
009cb55c	add x2,x2,#0xe98
009cb560	mov w1,#0x328
009cb564	b 0x009cb63c
009cb568	cbz x25,0x009cb65c
009cb56c	ldr x1,[x19, #0xca8]
009cb570	ldr x2,[x19, #0xcb8]
009cb574	add x0,sp,#0xa98
009cb578	mov x3,xzr
009cb57c	bl 0x00c34380
009cb580	cbz w0,0x009cb624
009cb584	ldr x8,[x19, #0xcc0]
009cb588	add x0,sp,#0xa98
009cb58c	mov x2,xzr
009cb590	add x1,x8,x25
009cb594	bl 0x00c36c40
009cb598	cbz w0,0x009cb624
009cb59c	str x25,[sp, #0x28]
009cb5a0	str w21,[sp, #0x34]
009cb5a4	mov w27,#0x1
009cb5a8	ldr x0,[x19, #0x878]
009cb5ac	cbz x0,0x009cb708
009cb5b0	ldr x8,[x19, #0x8]
009cb5b4	str xzr,[sp, #0x58]
009cb5b8	ldr x9,[x8, #0xc0]
009cb5bc	ldr w9,[x9, #0x60]
009cb5c0	tbz w9,#0x0,0x009cb70c
009cb5c4	tbnz w9,#0x3,0x009cb5e0
009cb5c8	ldr w8,[x8]
009cb5cc	cmp w8,#0x304
009cb5d0	b.lt 0x009cb5e0
009cb5d4	cmp w8,#0x10, LSL #12
009cb5d8	str xzr,[sp, #0x58]
009cb5dc	b.ne 0x009cb70c
009cb5e0	ldr w8,[x19, #0x84]
009cb5e4	str xzr,[sp, #0x58]
009cb5e8	sub w8,w8,#0x1
009cb5ec	cmp w8,#0x4
009cb5f0	b.cc 0x009cb70c
009cb5f4	ldr w8,[x19, #0x8e8]
009cb5f8	str xzr,[sp, #0x58]
009cb5fc	cmp w8,#0x1
009cb600	b.eq 0x009cb70c
009cb604	bl 0x00c34b80
009cb608	bl 0x00c35290
009cb60c	sub w8,w0,#0x6
009cb610	cmp w8,#0x2
009cb614	b.cs 0x009cb6e4
009cb618	mov w8,#0x8
009cb61c	str x8,[sp, #0x58]
009cb620	b 0x009cb70c
009cb624	bl 0x00c342a0
009cb628	adrp x0,0x2d3000
009cb62c	adrp x2,0x29f000
009cb630	add x0,x0,#0x7fb
009cb634	add x2,x2,#0xe98
009cb638	mov w1,#0x333
009cb63c	bl 0x00c342b0
009cb640	mov w2,#0x103
009cb644	mov w1,#0x50
009cb648	movk w2,#0xc, LSL #16
009cb64c	mov x0,x19
009cb650	mov x3,xzr
009cb654	bl 0x00c34410
009cb658	b 0x009cbf98
009cb65c	mov x27,xzr
009cb660	str x25,[sp, #0x28]
009cb664	str w21,[sp, #0x34]
009cb668	cbz x24,0x009cb5a8
009cb66c	add x21,x19,#0xcc0
009cb670	add x20,sp,#0xa98
009cb674	ldur x1,[x21, #-0x18]
009cb678	ldur x2,[x21, #-0x8]
009cb67c	mov x0,x20
009cb680	mov x3,xzr
009cb684	add w8,w1,#0x4
009cb688	mvn w8,w8
009cb68c	and x25,x8,#0x7
009cb690	str x25,[x21]
009cb694	bl 0x00c34380
009cb698	cbz w0,0x009cb6c8
009cb69c	mov x0,x20
009cb6a0	mov x1,x25
009cb6a4	mov x2,xzr
009cb6a8	bl 0x00c36c40
009cb6ac	cbz w0,0x009cb6c8
009cb6b0	add x27,x27,#0x1
009cb6b4	add x20,x20,#0x38
009cb6b8	cmp x27,x24
009cb6bc	add x21,x21,#0x30
009cb6c0	b.cc 0x009cb674
009cb6c4	b 0x009cb5a8
009cb6c8	bl 0x00c342a0
009cb6cc	adrp x0,0x2d3000
009cb6d0	adrp x2,0x29f000
009cb6d4	add x0,x0,#0x7fb
009cb6d8	add x2,x2,#0xe98
009cb6dc	mov w1,#0x344
009cb6e0	b 0x009cbf60
009cb6e4	cmp w0,#0x2
009cb6e8	b.ne 0x009cb708
009cb6ec	ldr x0,[x19, #0x878]
009cb6f0	bl 0x00c36300
009cb6f4	tbnz w0,#0x1f,0x009cbf20
009cb6f8	cmp w0,#0x2
009cb6fc	csel w8,wzr,w0,lt
009cb700	str x8,[sp, #0x58]
009cb704	b 0x009cb70c
009cb708	str xzr,[sp, #0x58]
009cb70c	add x0,sp,#0x98
009cb710	mov w2,#0xa00
009cb714	mov w1,wzr
009cb718	bl 0x00c301c0
009cb71c	str x22,[sp, #0x18]
009cb720	cbz x24,0x009cbb10
009cb724	add x8,x19,#0x7c
009cb728	str x8,[sp, #0x40]
009cb72c	ldr x8,[sp, #0x58]
009cb730	ldr x9,[sp, #0x70]
009cb734	mov x21,xzr
009cb738	stp x28,xzr,[sp, #0x60]
009cb73c	sxtw x8,w8
009cb740	str x8,[sp, #0x38]
009cb744	sxtw x8,w9
009cb748	str x8,[sp, #0x20]
009cb74c	mov w8,#0x50
009cb750	sub w8,w8,w9
009cb754	sxtw x10,w28
009cb758	add x28,sp,#0xa98
009cb75c	add x25,sp,#0x98
009cb760	sxtw x8,w8
009cb764	str x10,[sp, #0x10]
009cb768	stp x8,x23,[sp, #0x48]
009cb76c	ldr w9,[x19]
009cb770	str xzr,[sp, #0x80]
009cb774	ldr x8,[x19, #0x8]
009cb778	mov w11,#0x303
009cb77c	cmp w9,#0x304
009cb780	csel w23,w11,w9,eq
009cb784	ldr x10,[x8, #0xc0]
009cb788	ldrb w10,[x10, #0x60]
009cb78c	tbnz w10,#0x3,0x009cb7a4
009cb790	ldr w8,[x8]
009cb794	cmp w8,#0x304
009cb798	b.lt 0x009cb7a4
009cb79c	cmp w8,#0x10, LSL #12
009cb7a0	b.ne 0x009cb7c0
009cb7a4	ldr w8,[x19, #0x84]
009cb7a8	sub w8,w8,#0x1
009cb7ac	cmp w8,#0x4
009cb7b0	b.cc 0x009cb7c0
009cb7b4	ldr w8,[x19, #0x8e8]
009cb7b8	cmp w8,#0x1
009cb7bc	b.ne 0x009cb7e8
009cb7c0	ldr x8,[x19, #0x878]
009cb7c4	cbz x8,0x009cb7e8
009cb7c8	ldr x8,[sp, #0x60]
009cb7cc	mov w22,#0x17
009cb7d0	cmp w8,#0x15
009cb7d4	b.ne 0x009cb7f0
009cb7d8	ldr x8,[sp, #0x40]
009cb7dc	ldr w8,[x8]
009cb7e0	cmp w8,#0x2
009cb7e4	b.ne 0x009cb7f0
009cb7e8	ldr x8,[sp, #0x60]
009cb7ec	mov w22,w8
009cb7f0	mov x0,x19
009cb7f4	str w22,[x25, #0x4]
009cb7f8	bl 0x00c361a0
009cb7fc	cmp w0,#0xc
009cb800	b.ne 0x009cb840
009cb804	ldr w8,[x19, #0xba0]
009cb808	cbnz w8,0x009cb840
009cb80c	mov x0,x19
009cb810	bl 0x00c35af0
009cb814	and w8,w0,#0xffffff00
009cb818	cmp w8,#0x300
009cb81c	b.ne 0x009cb840
009cb820	mov x0,x19
009cb824	bl 0x00c35af0
009cb828	cmp w0,#0x302
009cb82c	b.lt 0x009cb840
009cb830	ldr w8,[x19, #0x8e8]
009cb834	cmp w8,#0x0
009cb838	mov w8,#0x301
009cb83c	csel w23,w8,w23,eq
009cb840	str w23,[x25]
009cb844	ldr x8,[x26, x21, LSL #0x3]
009cb848	ldr x9,[x19, #0x868]
009cb84c	mov w1,w22
009cb850	mov w2,#0x1
009cb854	add x10,x8,#0x400
009cb858	cmp x9,#0x0
009cb85c	mov x0,x28
009cb860	csel x20,x8,x10,eq
009cb864	bl 0x00c343a0
009cb868	cbz w0,0x009cbb74
009cb86c	mov w1,w23
009cb870	mov w2,#0x2
009cb874	mov x0,x28
009cb878	bl 0x00c343a0
009cb87c	cbz w0,0x009cbb74
009cb880	mov w1,#0x2
009cb884	mov x0,x28
009cb888	bl 0x00c343b0
009cb88c	cbz w0,0x009cbb74
009cb890	ldr x8,[sp, #0x58]
009cb894	cmp w8,#0x1
009cb898	b.lt 0x009cb8b0
009cb89c	ldr x1,[sp, #0x38]
009cb8a0	mov x0,x28
009cb8a4	mov x2,xzr
009cb8a8	bl 0x00c36c40
009cb8ac	cbz w0,0x009cbb74
009cb8b0	cbz x20,0x009cb8c8
009cb8b4	add x2,sp,#0x80
009cb8b8	mov x0,x28
009cb8bc	mov x1,x20
009cb8c0	bl 0x00c36c80
009cb8c4	cbz w0,0x009cbb74
009cb8c8	ldr x8,[sp, #0x80]
009cb8cc	ldr x23,[sp, #0x50]
009cb8d0	str x8,[x25, #0x20]
009cb8d4	ldr x8,[sp, #0x68]
009cb8d8	ldr x20,[x26, x21, LSL #0x3]
009cb8dc	add x1,x23,x8
009cb8e0	str x20,[x25, #0x8]
009cb8e4	str x1,[x25, #0x28]
009cb8e8	ldr x8,[x19, #0x868]
009cb8ec	cbz x8,0x009cb918
009cb8f0	mov x0,x19
009cb8f4	mov x1,x25
009cb8f8	bl 0x00c36bb0
009cb8fc	cbz w0,0x009cbe04
009cb900	ldr x1,[x25, #0x8]
009cb904	mov x0,x28
009cb908	mov x2,xzr
009cb90c	bl 0x00c36c40
009cb910	cbnz w0,0x009cb930
009cb914	b 0x009cbe04
009cb918	mov x0,x28
009cb91c	mov x2,x20
009cb920	bl 0x00c34390
009cb924	cbz w0,0x009cbe80
009cb928	ldr x8,[x25, #0x20]
009cb92c	str x8,[x25, #0x28]
009cb930	ldr x8,[x19, #0x8]
009cb934	ldr x9,[x8, #0xc0]
009cb938	ldrb w9,[x9, #0x60]
009cb93c	tbnz w9,#0x3,0x009cb954
009cb940	ldr w8,[x8]
009cb944	cmp w8,#0x304
009cb948	b.lt 0x009cb954
009cb94c	cmp w8,#0x10, LSL #12
009cb950	b.ne 0x009cb970
009cb954	ldr w8,[x19, #0x84]
009cb958	sub w8,w8,#0x1
009cb95c	cmp w8,#0x4
009cb960	b.cc 0x009cb970
009cb964	ldr w8,[x19, #0x8e8]
009cb968	cmp w8,#0x1
009cb96c	b.ne 0x009cba60
009cb970	ldr x8,[x19, #0x878]
009cb974	cbz x8,0x009cba60
009cb978	ldr x8,[sp, #0x60]
009cb97c	cmp w8,#0x15
009cb980	b.ne 0x009cb994
009cb984	ldr x8,[sp, #0x40]
009cb988	ldr w8,[x8]
009cb98c	cmp w8,#0x2
009cb990	b.eq 0x009cba60
009cb994	ldr x1,[sp, #0x10]
009cb998	mov w2,#0x1
009cb99c	mov x0,x28
009cb9a0	bl 0x00c343a0
009cb9a4	cbz w0,0x009cbef4
009cb9a8	ldr x8,[x25, #0x8]
009cb9ac	mov x0,x19
009cb9b0	add x8,x8,#0x1
009cb9b4	str x8,[x25, #0x8]
009cb9b8	bl 0x00c344c0
009cb9bc	ldr x22,[x25, #0x8]
009cb9c0	mov w10,w0
009cb9c4	cmp x22,x10
009cb9c8	b.cs 0x009cba60
009cb9cc	ldr x8,[x19, #0x1d50]
009cb9d0	cbz x8,0x009cba2c
009cb9d4	ldr x3,[x19, #0x1d58]
009cb9d8	ldr x1,[sp, #0x60]
009cb9dc	mov x0,x19
009cb9e0	mov x2,x22
009cb9e4	str x10,[sp, #0x8]
009cb9e8	blr x8
009cb9ec	ldr x10,[sp, #0x8]
009cb9f0	cbz x0,0x009cba60
009cb9f4	sub x8,x10,x22
009cb9f8	cmp x0,x8
009cb9fc	csel x22,x8,x0,hi
009cba00	mov x0,x28
009cba04	mov w1,wzr
009cba08	mov x2,x22
009cba0c	bl 0x00c36c70
009cba10	cbz w0,0x009cbf48
009cba14	ldr x8,[x25, #0x8]
009cba18	add x8,x8,x22
009cba1c	str x8,[x25, #0x8]
009cba20	ldr x8,[sp, #0x70]
009cba24	cbnz w8,0x009cba68
009cba28	b 0x009cbaa8
009cba2c	ldr x8,[x19, #0x1d60]
009cba30	cbz x8,0x009cba60
009cba34	sub x9,x8,#0x1
009cba38	tst x9,x8
009cba3c	b.eq 0x009cba50
009cba40	udiv x9,x22,x8
009cba44	msub x9,x9,x8,x22
009cba48	cbnz x9,0x009cba58
009cba4c	b 0x009cba60
009cba50	and x9,x9,x22
009cba54	cbz x9,0x009cba60
009cba58	sub x0,x8,x9
009cba5c	cbnz x0,0x009cb9f4
009cba60	ldr x8,[sp, #0x70]
009cba64	cbz w8,0x009cbaa8
009cba68	ldr x8,[x19, #0xa8]
009cba6c	tbnz w8,#0xa,0x009cbaa8
009cba70	ldr x1,[sp, #0x20]
009cba74	add x2,sp,#0x78
009cba78	mov x0,x28
009cba7c	bl 0x00c36c40
009cba80	cbz w0,0x009cbe2c
009cba84	ldr x8,[x19, #0x8]
009cba88	ldr x2,[sp, #0x78]
009cba8c	mov w3,#0x1
009cba90	mov x0,x19
009cba94	ldr x8,[x8, #0xc0]
009cba98	mov x1,x25
009cba9c	ldr x8,[x8, #0x8]
009cbaa0	blr x8
009cbaa4	cbz w0,0x009cbe2c
009cbaa8	ldr x1,[sp, #0x48]
009cbaac	mov x0,x28
009cbab0	mov x2,xzr
009cbab4	bl 0x00c36c80
009cbab8	cbz w0,0x009cbdc0
009cbabc	add x1,sp,#0x88
009cbac0	mov x0,x28
009cbac4	bl 0x00c36c60
009cbac8	cbz w0,0x009cbdc0
009cbacc	ldr x8,[sp, #0x68]
009cbad0	mov x0,x28
009cbad4	add x8,x20,x8
009cbad8	str x8,[sp, #0x68]
009cbadc	bl 0x00c36c50
009cbae0	ldr x8,[sp, #0x88]
009cbae4	add x21,x21,#0x1
009cbae8	add x28,x28,#0x38
009cbaec	cmp x21,x24
009cbaf0	sub x9,x0,x8
009cbaf4	str x8,[x25, #0x8]
009cbaf8	stp x9,x9,[x25, #0x20]
009cbafc	add x25,x25,#0x50
009cbb00	b.cc 0x009cb76c
009cbb04	ldr x28,[sp, #0x60]
009cbb08	ldr x8,[sp, #0x40]
009cbb0c	b 0x009cbb18
009cbb10	str xzr,[sp, #0x68]
009cbb14	add x8,x19,#0x7c
009cbb18	ldr w8,[x8]
009cbb1c	cmp w8,#0x2
009cbb20	b.ne 0x009cbb90
009cbb24	ldr x8,[sp, #0x70]
009cbb28	add x1,sp,#0x98
009cbb2c	mov w3,#0x1
009cbb30	mov x0,x19
009cbb34	sxtw x5,w8
009cbb38	mov x2,x24
009cbb3c	mov x4,xzr
009cbb40	bl 0x00c366f0
009cbb44	cmp w0,#0x0
009cbb48	b.gt 0x009cbbc4
009cbb4c	mov x0,x19
009cbb50	bl 0x00c35ce0
009cbb54	cbnz w0,0x009cbf7c
009cbb58	bl 0x00c342a0
009cbb5c	adrp x0,0x2d3000
009cbb60	adrp x2,0x29f000
009cbb64	add x0,x0,#0x7fb
009cbb68	add x2,x2,#0xe98
009cbb6c	mov w1,#0x41c
009cbb70	b 0x009cbf60
009cbb74	bl 0x00c342a0
009cbb78	adrp x0,0x2d3000
009cbb7c	adrp x2,0x29f000
009cbb80	add x0,x0,#0x7fb
009cbb84	add x2,x2,#0xe98
009cbb88	mov w1,#0x396
009cbb8c	b 0x009cbf60
009cbb90	ldr x8,[x19, #0x8]
009cbb94	ldr x9,[sp, #0x70]
009cbb98	add x1,sp,#0x98
009cbb9c	mov w3,#0x1
009cbba0	ldr x8,[x8, #0xc0]
009cbba4	sxtw x5,w9
009cbba8	mov x0,x19
009cbbac	mov x2,x24
009cbbb0	ldr x8,[x8]
009cbbb4	mov x4,xzr
009cbbb8	blr x8
009cbbbc	cmp w0,#0x0
009cbbc0	b.le 0x009cbddc
009cbbc4	mov x22,x28
009cbbc8	cbz x24,0x009cbd98
009cbbcc	ldr x8,[sp, #0x70]
009cbbd0	mov x21,xzr
009cbbd4	add x25,sp,#0xa98
009cbbd8	add x26,sp,#0x98
009cbbdc	sxtw x20,w8
009cbbe0	mov w8,#0x50
009cbbe4	sub x8,x8,x20
009cbbe8	mov w28,#0xcc8
009cbbec	str x8,[sp, #0x60]
009cbbf0	add x1,sp,#0x80
009cbbf4	mov x0,x25
009cbbf8	bl 0x00c36c60
009cbbfc	cbz w0,0x009cbe48
009cbc00	ldr x8,[sp, #0x80]
009cbc04	ldr x10,[sp, #0x60]
009cbc08	ldr x9,[x26, #0x8]
009cbc0c	add x10,x10,x8
009cbc10	cmp x10,x9
009cbc14	b.cc 0x009cbe48
009cbc18	subs x1,x9,x8
009cbc1c	b.cc 0x009cbe48
009cbc20	b.ls 0x009cbc34
009cbc24	mov x0,x25
009cbc28	mov x2,xzr
009cbc2c	bl 0x00c36c40
009cbc30	cbz w0,0x009cbe48
009cbc34	ldr x8,[sp, #0x70]
009cbc38	cbz w8,0x009cbc88
009cbc3c	ldr x8,[x19, #0xa8]
009cbc40	tbz w8,#0xa,0x009cbc88
009cbc44	add x2,sp,#0x78
009cbc48	mov x0,x25
009cbc4c	mov x1,x20
009cbc50	bl 0x00c36c40
009cbc54	cbz w0,0x009cbe9c
009cbc58	ldr x8,[x19, #0x8]
009cbc5c	ldr x2,[sp, #0x78]
009cbc60	mov w3,#0x1
009cbc64	mov x0,x19
009cbc68	ldr x8,[x8, #0xc0]
009cbc6c	mov x1,x26
009cbc70	ldr x8,[x8, #0x8]
009cbc74	blr x8
009cbc78	cbz w0,0x009cbe9c
009cbc7c	ldr x8,[x26, #0x8]
009cbc80	add x8,x8,x20
009cbc84	str x8,[x26, #0x8]
009cbc88	add x1,sp,#0x88
009cbc8c	mov x0,x25
009cbc90	bl 0x00c36c60
009cbc94	cbz w0,0x009cbe64
009cbc98	mov x0,x25
009cbc9c	bl 0x00c34350
009cbca0	cbz w0,0x009cbe64
009cbca4	ldr x8,[x19, #0x4c0]
009cbca8	cbz x8,0x009cbd50
009cbcac	mov x0,x25
009cbcb0	bl 0x00c36c50
009cbcb4	ldr x8,[sp, #0x88]
009cbcb8	ldr x9,[x19, #0x4c0]
009cbcbc	ldr w1,[x26]
009cbcc0	ldr x6,[x19, #0x4c8]
009cbcc4	sub x8,x0,x8
009cbcc8	sub x3,x8,#0x5
009cbccc	mov w0,#0x1
009cbcd0	mov w2,#0x100
009cbcd4	mov w4,#0x5
009cbcd8	mov x5,x19
009cbcdc	blr x9
009cbce0	ldr x8,[x19, #0x8]
009cbce4	ldr x9,[x8, #0xc0]
009cbce8	ldrb w9,[x9, #0x60]
009cbcec	tbnz w9,#0x3,0x009cbd04
009cbcf0	ldr w8,[x8]
009cbcf4	cmp w8,#0x304
009cbcf8	b.lt 0x009cbd04
009cbcfc	cmp w8,#0x10, LSL #12
009cbd00	b.ne 0x009cbd20
009cbd04	ldr w8,[x19, #0x84]
009cbd08	sub w8,w8,#0x1
009cbd0c	cmp w8,#0x4
009cbd10	b.cc 0x009cbd20
009cbd14	ldr w8,[x19, #0x8e8]
009cbd18	cmp w8,#0x1
009cbd1c	b.ne 0x009cbd50
009cbd20	ldr x8,[x19, #0x878]
009cbd24	cbz x8,0x009cbd50
009cbd28	strb w22,[sp, #0x78]
009cbd2c	ldr w1,[x26]
009cbd30	ldr x8,[x19, #0x4c0]
009cbd34	ldr x6,[x19, #0x4c8]
009cbd38	mov w0,#0x1
009cbd3c	mov w2,#0x101
009cbd40	add x3,sp,#0x78
009cbd44	mov w4,#0x1
009cbd48	mov x5,x19
009cbd4c	blr x8
009cbd50	mov x0,x25
009cbd54	bl 0x00c34360
009cbd58	cbz w0,0x009cbeb8
009cbd5c	ldr x8,[x26, #0x8]
009cbd60	ldr w9,[sp, #0x34]
009cbd64	add x8,x8,#0x5
009cbd68	str x8,[x26, #0x8]
009cbd6c	cbnz w9,0x009cbed4
009cbd70	ldr x9,[sp, #0x28]
009cbd74	add x21,x21,#0x1
009cbd78	str w22,[x26, #0x4]
009cbd7c	add x25,x25,#0x38
009cbd80	add x8,x9,x8
009cbd84	add x26,x26,#0x50
009cbd88	str x8,[x19, x28#0x0]
009cbd8c	cmp x21,x24
009cbd90	add x28,x28,#0x30
009cbd94	b.cc 0x009cbbf0
009cbd98	ldr x3,[sp, #0x68]
009cbd9c	ldr x4,[sp, #0x18]
009cbda0	mov x0,x19
009cbda4	mov w1,w22
009cbda8	mov x2,x23
009cbdac	str x3,[x19, #0x1cd8]
009cbdb0	str x23,[x19, #0x1cf0]
009cbdb4	str w22,[x19, #0x1ce0]
009cbdb8	str x3,[x19, #0x1ce8]
009cbdbc	b 0x009cb3c8
009cbdc0	bl 0x00c342a0
009cbdc4	adrp x0,0x2d3000
009cbdc8	adrp x2,0x29f000
009cbdcc	add x0,x0,#0x7fb
009cbdd0	add x2,x2,#0xe98
009cbdd4	mov w1,#0x409
009cbdd8	b 0x009cbf60
009cbddc	mov x0,x19
009cbde0	bl 0x00c35ce0
009cbde4	cbnz w0,0x009cbf7c
009cbde8	bl 0x00c342a0
009cbdec	adrp x0,0x2d3000
009cbdf0	adrp x2,0x29f000
009cbdf4	add x0,x0,#0x7fb
009cbdf8	add x2,x2,#0xe98
009cbdfc	mov w1,#0x425
009cbe00	b 0x009cbf60
009cbe04	bl 0x00c342a0
009cbe08	adrp x0,0x2d3000
009cbe0c	adrp x2,0x29f000
009cbe10	add x0,x0,#0x7fb
009cbe14	add x2,x2,#0xe98
009cbe18	mov w1,#0x3a9
009cbe1c	bl 0x00c342b0
009cbe20	mov w1,#0x50
009cbe24	mov w2,#0x8d
009cbe28	b 0x009cbf70
009cbe2c	bl 0x00c342a0
009cbe30	adrp x0,0x2d3000
009cbe34	adrp x2,0x29f000
009cbe38	add x0,x0,#0x7fb
009cbe3c	add x2,x2,#0xe98
009cbe40	mov w1,#0x3f5
009cbe44	b 0x009cbf60
009cbe48	bl 0x00c342a0
009cbe4c	adrp x0,0x2d3000
009cbe50	adrp x2,0x29f000
009cbe54	add x0,x0,#0x7fb
009cbe58	add x2,x2,#0xe98
009cbe5c	mov w1,#0x440
009cbe60	b 0x009cbf60
009cbe64	bl 0x00c342a0
009cbe68	adrp x0,0x2d3000
009cbe6c	adrp x2,0x29f000
009cbe70	add x0,x0,#0x7fb
009cbe74	add x2,x2,#0xe98
009cbe78	mov w1,#0x450
009cbe7c	b 0x009cbf60
009cbe80	bl 0x00c342a0
009cbe84	adrp x0,0x2d3000
009cbe88	adrp x2,0x29f000
009cbe8c	add x0,x0,#0x7fb
009cbe90	add x2,x2,#0xe98
009cbe94	mov w1,#0x3b1
009cbe98	b 0x009cbf60
009cbe9c	bl 0x00c342a0
009cbea0	adrp x0,0x2d3000
009cbea4	adrp x2,0x29f000
009cbea8	add x0,x0,#0x7fb
009cbeac	add x2,x2,#0xe98
009cbeb0	mov w1,#0x448
009cbeb4	b 0x009cbf60
009cbeb8	bl 0x00c342a0
009cbebc	adrp x0,0x2d3000
009cbec0	adrp x2,0x29f000
009cbec4	add x0,x0,#0x7fb
009cbec8	add x2,x2,#0xe98
009cbecc	mov w1,#0x464
009cbed0	b 0x009cbf60
009cbed4	cbz x21,0x009cbf10
009cbed8	bl 0x00c342a0
009cbedc	adrp x0,0x2d3000
009cbee0	adrp x2,0x29f000
009cbee4	add x0,x0,#0x7fb
009cbee8	add x2,x2,#0xe98
009cbeec	mov w1,#0x472
009cbef0	b 0x009cbf60
009cbef4	bl 0x00c342a0
009cbef8	adrp x0,0x2d3000
009cbefc	adrp x2,0x29f000
009cbf00	add x0,x0,#0x7fb
009cbf04	add x2,x2,#0xe98
009cbf08	orr w1,wzr,#0x3c0
009cbf0c	b 0x009cbf60
009cbf10	ldr x9,[sp, #0x18]
009cbf14	mov w0,#0x1
009cbf18	str x8,[x9]
009cbf1c	b 0x009cbf9c
009cbf20	bl 0x00c342a0
009cbf24	adrp x0,0x2d3000
009cbf28	adrp x2,0x29f000
009cbf2c	add x0,x0,#0x7fb
009cbf30	add x2,x2,#0xe98
009cbf34	mov w1,#0x351
009cbf38	bl 0x00c342b0
009cbf3c	mov w1,#0x50
009cbf40	mov w2,#0x112
009cbf44	b 0x009cbf70
009cbf48	bl 0x00c342a0
009cbf4c	adrp x0,0x2d3000
009cbf50	adrp x2,0x29f000
009cbf54	add x0,x0,#0x7fb
009cbf58	add x2,x2,#0xe98
009cbf5c	mov w1,#0x3e2
009cbf60	bl 0x00c342b0
009cbf64	mov w2,#0x103
009cbf68	mov w1,#0x50
009cbf6c	movk w2,#0xc, LSL #16
009cbf70	mov x0,x19
009cbf74	mov x3,xzr
009cbf78	bl 0x00c34410
009cbf7c	cbz x27,0x009cbf98
009cbf80	add x19,sp,#0xa98
009cbf84	mov x0,x19
009cbf88	bl 0x00c34340
009cbf8c	subs x27,x27,#0x1
009cbf90	add x19,x19,#0x38
009cbf94	b.ne 0x009cbf84
009cbf98	mov w0,#0xffffffff
009cbf9c	add sp,sp,#0x1, LSL #12
009cbfa0	add sp,sp,#0x1a0
009cbfa4	ldp x29,x30,[sp, #0x50]
009cbfa8	ldp x20,x19,[sp, #0x40]
009cbfac	ldp x22,x21,[sp, #0x30]
009cbfb0	ldp x24,x23,[sp, #0x20]
009cbfb4	ldp x26,x25,[sp, #0x10]
009cbfb8	ldp x28,x27,[sp], #0x60
009cbfbc	ret
