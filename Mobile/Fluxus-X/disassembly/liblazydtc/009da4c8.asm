; FUN_009da4c8 @ 009da4c8
009da4c8	sub sp,sp,#0xe0
009da4cc	stp x28,x27,[sp, #0x80]
009da4d0	stp x26,x25,[sp, #0x90]
009da4d4	stp x24,x23,[sp, #0xa0]
009da4d8	stp x22,x21,[sp, #0xb0]
009da4dc	stp x20,x19,[sp, #0xc0]
009da4e0	stp x29,x30,[sp, #0xd0]
009da4e4	ldr w8,[x0, #0x48]
009da4e8	str d8,[sp, #0x70]
009da4ec	add x29,sp,#0xd0
009da4f0	cmp w8,#0x1
009da4f4	b.ne 0x009da500
009da4f8	mov w21,#0xffffffff
009da4fc	b 0x009daf7c
009da500	mov x19,x0
009da504	mov w26,w1
009da508	bl 0x00c323e0
009da50c	bl 0x00c30710
009da510	str wzr,[x0]
009da514	ldr x20,[x19, #0x978]
009da518	cbnz x20,0x009da524
009da51c	ldr x8,[x19, #0x9a8]
009da520	ldr x20,[x8, #0x120]
009da524	ldr w8,[x19, #0x6c]
009da528	ldr w9,[x19, #0x64]
009da52c	add w8,w8,#0x1
009da530	str w8,[x19, #0x6c]
009da534	cbz w9,0x009da548
009da538	ldr w8,[x19, #0x5c]
009da53c	cbnz w8,0x009da55c
009da540	ldr w8,[x19, #0x48]
009da544	cbnz w8,0x009da560
009da548	ldrb w8,[x19, #0xa9]
009da54c	tbnz w8,#0x3,0x009da55c
009da550	mov x0,x19
009da554	bl 0x00c342e0
009da558	cbz w0,0x009da4f8
009da55c	ldr w8,[x19, #0x48]
009da560	cbz w8,0x009da5ec
009da564	cmp w8,#0x4
009da568	b.eq 0x009da5f0
009da56c	add x9,x19,#0x5c
009da570	add x27,x19,#0x38
009da574	add x24,x19,#0x8
009da578	str x9,[sp, #0x28]
009da57c	add x21,x19,#0x88
009da580	adrp x10,0xcb5000
009da584	adrp x11,0xcb5000
009da588	adrp x12,0xcb5000
009da58c	adrp x13,0xcb5000
009da590	adrp x14,0xcb5000
009da594	adrp x15,0xcb5000
009da598	adrp x16,0xcb5000
009da59c	adrp x17,0xcb5000
009da5a0	adrp x9,0x29b000
009da5a4	adrp x18,0xcb5000
009da5a8	adrp x0,0xcb5000
009da5ac	ldr x10,[x10, #0x258]
009da5b0	ldr x11,[x11, #0x218]
009da5b4	ldr x12,[x12, #0x250]
009da5b8	ldr x13,[x13, #0x210]
009da5bc	ldr x14,[x14, #0x238]
009da5c0	ldr x15,[x15, #0x1f8]
009da5c4	ldr x16,[x16, #0x230]
009da5c8	ldr x17,[x17, #0x1f0]
009da5cc	ldr x18,[x18, #0x260]
009da5d0	ldr x0,[x0, #0x220]
009da5d4	ldr d8,[x9, #0xf78]
009da5d8	adrp x25,0x74d000
009da5dc	add x25,x25,#0x78
009da5e0	stur w26,[x29, #-0x58]
009da5e4	str x20,[sp, #0x20]
009da5e8	b 0x009da8a4
009da5ec	stp wzr,wzr,[x19, #0x5c]
009da5f0	mov x27,x19
009da5f4	str w26,[x27, #0x38]!
009da5f8	cbz x20,0x009da640
009da5fc	ldr x8,[x19, #0x240]
009da600	cbz x8,0x009da630
009da604	ldr x8,[x19, #0x2c8]
009da608	cbz x8,0x009da630
009da60c	ldr x8,[x19, #0x8]
009da610	ldr x9,[x8, #0xc0]
009da614	ldrb w9,[x9, #0x60]
009da618	tbnz w9,#0x3,0x009da630
009da61c	ldr w8,[x8]
009da620	cmp w8,#0x304
009da624	b.lt 0x009da630
009da628	cmp w8,#0x10, LSL #12
009da62c	b.ne 0x009da640
009da630	mov w1,#0x10
009da634	mov w2,#0x1
009da638	mov x0,x19
009da63c	blr x20
009da640	mov x24,x19
009da644	ldr x8,[x24, #0x8]!
009da648	ldr w3,[x19]
009da64c	ldr x8,[x8, #0xc0]
009da650	ldrb w8,[x8, #0x60]
009da654	tbnz w8,#0x3,0x009da680
009da658	and w8,w3,#0xffffff00
009da65c	cmp w8,#0x300
009da660	b.eq 0x009da69c
009da664	bl 0x00c342a0
009da668	adrp x0,0x2db000
009da66c	adrp x2,0x2a3000
009da670	add x0,x0,#0xc90
009da674	add x2,x2,#0xd76
009da678	mov w1,#0x17b
009da67c	b 0x009da7c8
009da680	and w8,w3,#0xff00
009da684	orr w9,wzr,#0xfe00
009da688	cmp w8,w9
009da68c	b.eq 0x009da69c
009da690	cbnz w26,0x009da778
009da694	cmp w8,#0x100
009da698	b.ne 0x009da778
009da69c	mov w1,#0x9
009da6a0	mov x0,x19
009da6a4	mov w2,wzr
009da6a8	mov x4,xzr
009da6ac	bl 0x00c34a30
009da6b0	cbz w0,0x009da738
009da6b4	mov x21,x19
009da6b8	ldr x8,[x21, #0x88]!
009da6bc	cbz x8,0x009da754
009da6c0	mov x0,x19
009da6c4	bl 0x00c344a0
009da6c8	cbz w0,0x009da794
009da6cc	mov x0,x19
009da6d0	str xzr,[x19, #0x98]
009da6d4	str wzr,[x19, #0x198]
009da6d8	bl 0x00c35dd0
009da6dc	cbz w0,0x009da7b0
009da6e0	mov x9,x19
009da6e4	ldr w8,[x9, #0x5c]!
009da6e8	str x9,[sp, #0x28]
009da6ec	cbnz w8,0x009da6f8
009da6f0	ldr w8,[x19, #0x48]
009da6f4	cbz w8,0x009da700
009da6f8	ldr w8,[x19, #0xba0]
009da6fc	cbz w8,0x009da724
009da700	mov x0,x19
009da704	bl 0x00c37090
009da708	cbz w0,0x009daf40
009da70c	ldr x8,[x19, #0x240]
009da710	cbz x8,0x009da71c
009da714	ldr x8,[x19, #0x2c8]
009da718	cbnz x8,0x009da724
009da71c	mov w8,#0x1
009da720	str w8,[x19, #0x68]
009da724	adrp x8,0x29b000
009da728	ldr d0,[x8, #0x8b0]
009da72c	orr w8,wzr,#0x3
009da730	str d0,[x19, #0x48]
009da734	b 0x009da580
009da738	bl 0x00c342a0
009da73c	adrp x0,0x2db000
009da740	adrp x2,0x2a3000
009da744	add x0,x0,#0xc90
009da748	add x2,x2,#0xd76
009da74c	mov w1,#0x181
009da750	b 0x009da7c8
009da754	bl 0x00c37020
009da758	mov x22,x0
009da75c	cbz x0,0x009da7f0
009da760	mov w1,#0x4000
009da764	mov x0,x22
009da768	bl 0x00c37000
009da76c	cbz x0,0x009da80c
009da770	str x22,[x21]
009da774	b 0x009da6c0
009da778	bl 0x00c342a0
009da77c	adrp x0,0x2db000
009da780	adrp x2,0x2a3000
009da784	add x0,x0,#0xc90
009da788	add x2,x2,#0xd76
009da78c	mov w1,#0x176
009da790	b 0x009da7c8
009da794	bl 0x00c342a0
009da798	adrp x0,0x2db000
009da79c	adrp x2,0x2a3000
009da7a0	add x0,x0,#0xc90
009da7a4	add x2,x2,#0xd76
009da7a8	mov w1,#0x193
009da7ac	b 0x009da7c8
009da7b0	bl 0x00c342a0
009da7b4	adrp x0,0x2db000
009da7b8	adrp x2,0x2a3000
009da7bc	add x0,x0,#0xc90
009da7c0	add x2,x2,#0xd76
009da7c4	mov w1,#0x1a5
009da7c8	bl 0x00c342b0
009da7cc	mov w2,#0x103
009da7d0	mov w1,#0xffffffff
009da7d4	movk w2,#0xc, LSL #16
009da7d8	mov x0,x19
009da7dc	mov x3,xzr
009da7e0	mov w21,#0xffffffff
009da7e4	bl 0x009da2d4
009da7e8	mov x22,xzr
009da7ec	b 0x009daf48
009da7f0	bl 0x00c342a0
009da7f4	adrp x0,0x2db000
009da7f8	adrp x2,0x2a3000
009da7fc	add x0,x0,#0xc90
009da800	add x2,x2,#0xd76
009da804	mov w1,#0x187
009da808	b 0x009da824
009da80c	bl 0x00c342a0
009da810	adrp x0,0x2db000
009da814	adrp x2,0x2a3000
009da818	add x0,x0,#0xc90
009da81c	add x2,x2,#0xd76
009da820	mov w1,#0x18b
009da824	bl 0x00c342b0
009da828	mov w2,#0x103
009da82c	mov w1,#0xffffffff
009da830	movk w2,#0xc, LSL #16
009da834	mov x0,x19
009da838	mov x3,xzr
009da83c	mov w21,#0xffffffff
009da840	bl 0x009da2d4
009da844	b 0x009daf48
009da848	adrp x10,0xcb5000
009da84c	adrp x11,0xcb5000
009da850	adrp x12,0xcb5000
009da854	adrp x13,0xcb5000
009da858	adrp x14,0xcb5000
009da85c	adrp x15,0xcb5000
009da860	adrp x16,0xcb5000
009da864	adrp x17,0xcb5000
009da868	adrp x18,0xcb5000
009da86c	adrp x0,0xcb5000
009da870	ldr x21,[sp, #0x8]
009da874	ldr x10,[x10, #0x258]
009da878	ldr x11,[x11, #0x218]
009da87c	ldr x12,[x12, #0x250]
009da880	ldr x13,[x13, #0x210]
009da884	ldr x14,[x14, #0x238]
009da888	ldr x15,[x15, #0x1f8]
009da88c	ldr x16,[x16, #0x230]
009da890	ldr x17,[x17, #0x1f0]
009da894	ldr x18,[x18, #0x260]
009da898	ldr x0,[x0, #0x220]
009da89c	orr w8,wzr,#0x3
009da8a0	str x8,[x19, #0x48]
009da8a4	cmp w8,#0x2
009da8a8	b.eq 0x009dab4c
009da8ac	cmp w8,#0x3
009da8b0	b.ne 0x009daee8
009da8b4	ldr x28,[x19, #0x978]
009da8b8	cbnz x28,0x009da8c4
009da8bc	ldr x8,[x19, #0x9a8]
009da8c0	ldr x28,[x8, #0x120]
009da8c4	ldr w8,[x27]
009da8c8	adrp x9,0xcb5000
009da8cc	cmp w8,#0x0
009da8d0	adrp x8,0xcb5000
009da8d4	ldr x8,[x8, #0x248]
009da8d8	ldr x9,[x9, #0x208]
009da8dc	csel x26,x0,x18,eq
009da8e0	csel x22,x9,x8,eq
009da8e4	adrp x8,0xcb5000
009da8e8	adrp x9,0xcb5000
009da8ec	ldr x8,[x8, #0x240]
009da8f0	ldr x9,[x9, #0x200]
009da8f4	csel x25,x9,x8,eq
009da8f8	adrp x8,0xcb5000
009da8fc	adrp x9,0xcb5000
009da900	ldr x8,[x8, #0x228]
009da904	ldr x9,[x9, #0x1e8]
009da908	csel x20,x9,x8,eq
009da90c	b 0x009da914
009da910	str wzr,[x19, #0x4c]
009da914	ldr w8,[x19, #0x4c]
009da918	cmp w8,#0x3
009da91c	b.hi 0x009dadf0
009da920	adrp x9,0x74d000
009da924	add x9,x9,#0x38
009da928	ldrsw x8,[x9, x8, LSL #0x2]
009da92c	add x8,x8,x9
009da930	br x8
009da934	cbz x28,0x009dab1c
009da938	ldr w8,[x27]
009da93c	cbz w8,0x009dab0c
009da940	mov w1,#0x2001
009da944	b 0x009dab10
009da948	ldr w1,[x19, #0x50]
009da94c	mov x0,x19
009da950	blr x22
009da954	cmp w0,#0x5
009da958	str w0,[x19, #0x50]
009da95c	b.hi 0x009da980
009da960	adrp x9,0x74d000
009da964	mov w8,w0
009da968	add x9,x9,#0x48
009da96c	ldrsw x8,[x9, x8, LSL #0x2]
009da970	add x8,x8,x9
009da974	br x8
009da978	mov w8,#0x2
009da97c	str w8,[x19, #0x4c]
009da980	add x1,sp,#0x30
009da984	add x2,sp,#0x68
009da988	sub x3,x29,#0x54
009da98c	mov x0,x19
009da990	blr x20
009da994	cbz w0,0x009daf38
009da998	ldur w8,[x29, #-0x54]
009da99c	cmn w8,#0x1
009da9a0	b.eq 0x009daa00
009da9a4	ldr x1,[x21]
009da9a8	add x0,sp,#0x30
009da9ac	bl 0x00c37040
009da9b0	cbz w0,0x009dae60
009da9b4	ldr x8,[x19, #0x8]
009da9b8	ldur w2,[x29, #-0x54]
009da9bc	add x1,sp,#0x30
009da9c0	mov x0,x19
009da9c4	ldr x8,[x8, #0xc0]
009da9c8	ldr x8,[x8, #0x68]
009da9cc	blr x8
009da9d0	cbz w0,0x009dae60
009da9d4	ldr x8,[sp, #0x68]
009da9d8	cbz x8,0x009daa14
009da9dc	add x1,sp,#0x30
009da9e0	mov x0,x19
009da9e4	blr x8
009da9e8	cmp w0,#0x0
009da9ec	b.le 0x009db01c
009da9f0	cmp w0,#0x2
009da9f4	b.ne 0x009daa14
009da9f8	add x0,sp,#0x30
009da9fc	bl 0x00c34340
009daa00	orr x8,xzr,#0x300000003
009daa04	stur x8,[x19, #0x4c]
009daa08	b 0x009da914
009daa0c	ldr w1,[x19, #0x50]
009daa10	b 0x009daae0
009daa14	ldr x8,[x19, #0x8]
009daa18	ldur w2,[x29, #-0x54]
009daa1c	add x1,sp,#0x30
009daa20	mov x0,x19
009daa24	ldr x8,[x8, #0xc0]
009daa28	ldr x8,[x8, #0x70]
009daa2c	blr x8
009daa30	cbz w0,0x009daefc
009daa34	add x0,sp,#0x30
009daa38	bl 0x00c34360
009daa3c	cbz w0,0x009daefc
009daa40	ldr x8,[x24]
009daa44	ldr x8,[x8, #0xc0]
009daa48	ldrb w8,[x8, #0x60]
009daa4c	tbz w8,#0x3,0x009daa60
009daa50	ldr w8,[x19, #0x78]
009daa54	cbz w8,0x009daa60
009daa58	mov x0,x19
009daa5c	bl 0x00c34140
009daa60	ldr x8,[sp, #0x28]
009daa64	ldr w8,[x8]
009daa68	cmp w8,#0x23
009daa6c	b.eq 0x009daa78
009daa70	cmp w8,#0x10
009daa74	b.ne 0x009daaa0
009daa78	ldr x8,[x24]
009daa7c	ldr x8,[x8, #0xc0]
009daa80	ldrb w8,[x8, #0x60]
009daa84	tbnz w8,#0x3,0x009daac0
009daa88	mov w1,#0x14
009daa8c	mov x0,x19
009daa90	bl 0x00c34850
009daa94	cmp w0,#0x1
009daa98	b.ge 0x009daad4
009daa9c	b 0x009daf38
009daaa0	ldr x8,[x19, #0x8]
009daaa4	mov x0,x19
009daaa8	ldr x8,[x8, #0xc0]
009daaac	ldr x8,[x8, #0x78]
009daab0	blr x8
009daab4	cmp w0,#0x1
009daab8	b.ge 0x009daad4
009daabc	b 0x009daf38
009daac0	mov w1,#0x14
009daac4	mov x0,x19
009daac8	bl 0x00c343c0
009daacc	cmp w0,#0x1
009daad0	b.lt 0x009daf38
009daad4	orr x8,xzr,#0x300000003
009daad8	orr w1,wzr,#0x3
009daadc	stur x8,[x19, #0x4c]
009daae0	mov x0,x19
009daae4	blr x25
009daae8	cmp w0,#0x5
009daaec	str w0,[x19, #0x50]
009daaf0	b.hi 0x009da914
009daaf4	adrp x9,0x74d000
009daaf8	mov w8,w0
009daafc	add x9,x9,#0x60
009dab00	ldrsw x8,[x9, x8, LSL #0x2]
009dab04	add x8,x8,x9
009dab08	br x8
009dab0c	mov w1,#0x1001
009dab10	mov w2,#0x1
009dab14	mov x0,x19
009dab18	blr x28
009dab1c	mov x0,x19
009dab20	blr x26
009dab24	cmp w0,#0x1
009dab28	b.eq 0x009dab3c
009dab2c	cbz w0,0x009db080
009dab30	cmp w0,#0x2
009dab34	b.ne 0x009da914
009dab38	b 0x009dad80
009dab3c	orr x8,xzr,#0x300000003
009dab40	movk x8,#0x1
009dab44	stur x8,[x19, #0x4c]
009dab48	b 0x009da914
009dab4c	str xzr,[sp, #0x68]
009dab50	str x21,[sp, #0x8]
009dab54	ldr x21,[x19, #0x978]
009dab58	cbnz x21,0x009dab64
009dab5c	ldr x8,[x19, #0x9a8]
009dab60	ldr x21,[x8, #0x120]
009dab64	ldr w8,[x19, #0x38]
009dab68	ldr w9,[x19, #0x68]
009dab6c	cmp w8,#0x0
009dab70	csel x8,x15,x14,eq
009dab74	csel x28,x11,x10,eq
009dab78	csel x23,x13,x12,eq
009dab7c	str x8,[sp, #0x18]
009dab80	csel x8,x17,x16,eq
009dab84	str x8,[sp, #0x10]
009dab88	cbz w9,0x009daba0
009dab8c	mov w8,#0x1
009dab90	str w8,[x19, #0xa08]
009dab94	str wzr,[x19, #0x68]
009dab98	b 0x009daba0
009dab9c	stur d8,[x19, #0x54]
009daba0	ldr w8,[x19, #0x54]
009daba4	cmp w8,#0x2
009daba8	b.eq 0x009dabec
009dabac	cmp w8,#0x1
009dabb0	b.eq 0x009dace4
009dabb4	cbnz w8,0x009dae0c
009dabb8	ldr x8,[x24]
009dabbc	ldr x8,[x8, #0xc0]
009dabc0	ldrb w8,[x8, #0x60]
009dabc4	tbnz w8,#0x3,0x009dac20
009dabc8	sub x1,x29,#0x54
009dabcc	mov x0,x19
009dabd0	bl 0x00c37080
009dabd4	cbz w0,0x009daf40
009dabd8	cbz x21,0x009dac44
009dabdc	ldr w8,[x27]
009dabe0	cbz w8,0x009dac34
009dabe4	mov w1,#0x2001
009dabe8	b 0x009dac38
009dabec	ldr w1,[x19, #0x58]
009dabf0	ldr x8,[sp, #0x18]
009dabf4	mov x0,x19
009dabf8	blr x8
009dabfc	cmp w0,#0x5
009dac00	str w0,[x19, #0x58]
009dac04	b.hi 0x009daba0
009dac08	mov w8,w0
009dac0c	ldrsw x8,[x25, x8, LSL #0x2]
009dac10	add x8,x8,x25
009dac14	br x8
009dac18	str wzr,[x19, #0x54]
009dac1c	b 0x009daba0
009dac20	sub x1,x29,#0x54
009dac24	mov x0,x19
009dac28	bl 0x00c37050
009dac2c	cbnz w0,0x009dabd8
009dac30	b 0x009daf40
009dac34	mov w1,#0x1001
009dac38	mov w2,#0x1
009dac3c	mov x0,x19
009dac40	blr x21
009dac44	ldur w1,[x29, #-0x54]
009dac48	mov x0,x19
009dac4c	blr x28
009dac50	cbz w0,0x009daf40
009dac54	ldr x8,[sp, #0x10]
009dac58	ldr x22,[x19, #0x2d0]
009dac5c	mov x0,x19
009dac60	blr x8
009dac64	cmp x22,x0
009dac68	b.hi 0x009dae84
009dac6c	ldr x8,[x24]
009dac70	ldr x8,[x8, #0xc0]
009dac74	ldrb w8,[x8, #0x60]
009dac78	tbnz w8,#0x3,0x009dacdc
009dac7c	ldr x8,[x19, #0x2d0]
009dac80	cbz x8,0x009dacdc
009dac84	ldp x0,x22,[x19, #0x88]
009dac88	mov x20,x24
009dac8c	mov x24,x21
009dac90	mov x21,x28
009dac94	ldr x26,[x0, #0x8]
009dac98	add x28,x8,#0x4
009dac9c	sxtw x1,w28
009daca0	bl 0x00c37010
009daca4	cbz x0,0x009db054
009daca8	sub x8,x22,x26
009dacac	cmp x8,x28
009dacb0	b.hi 0x009db054
009dacb4	ldr x9,[x19, #0x88]
009dacb8	ldur w26,[x29, #-0x58]
009dacbc	mov x28,x21
009dacc0	mov x21,x24
009dacc4	ldr x9,[x9, #0x8]
009dacc8	mov x24,x20
009daccc	add x8,x9,x8
009dacd0	str x8,[x19, #0x90]
009dacd4	ldr x8,[sp, #0x20]
009dacd8	mov x20,x8
009dacdc	mov w8,#0x1
009dace0	str w8,[x19, #0x54]
009dace4	ldr x8,[x24]
009dace8	ldr x8,[x8, #0xc0]
009dacec	ldrb w8,[x8, #0x60]
009dacf0	tbnz w8,#0x3,0x009dad08
009dacf4	add x1,sp,#0x68
009dacf8	mov x0,x19
009dacfc	bl 0x00c37070
009dad00	cbnz w0,0x009dad18
009dad04	b 0x009daf40
009dad08	add x1,sp,#0x68
009dad0c	mov x0,x19
009dad10	bl 0x00c37060
009dad14	cbz w0,0x009daf40
009dad18	str wzr,[x19, #0xa08]
009dad1c	ldr x8,[sp, #0x68]
009dad20	tbnz x8,#0x3f,0x009dae28
009dad24	ldr x9,[x19, #0x90]
009dad28	add x1,sp,#0x30
009dad2c	mov x0,x19
009dad30	stp x9,x8,[sp, #0x30]
009dad34	blr x23
009dad38	cmp w0,#0x2
009dad3c	str xzr,[x19, #0x98]
009dad40	b.eq 0x009dab9c
009dad44	cmp w0,#0x1
009dad48	b.eq 0x009dad58
009dad4c	cbz w0,0x009daeac
009dad50	str wzr,[x19, #0x54]
009dad54	b 0x009daba0
009dad58	ldr x8,[x24]
009dad5c	ldr x8,[x8, #0xc0]
009dad60	ldrb w8,[x8, #0x60]
009dad64	tbz w8,#0x3,0x009da848
009dad68	mov x0,x19
009dad6c	bl 0x00c34150
009dad70	b 0x009da848
009dad74	mov w8,#0x4
009dad78	str w8,[x19, #0x48]
009dad7c	b 0x009dad8c
009dad80	mov w8,#0x2
009dad84	str w8,[x19, #0x48]
009dad88	str wzr,[x19, #0x54]
009dad8c	adrp x10,0xcb5000
009dad90	adrp x11,0xcb5000
009dad94	adrp x12,0xcb5000
009dad98	adrp x13,0xcb5000
009dad9c	adrp x14,0xcb5000
009dada0	adrp x15,0xcb5000
009dada4	adrp x16,0xcb5000
009dada8	adrp x17,0xcb5000
009dadac	adrp x18,0xcb5000
009dadb0	adrp x0,0xcb5000
009dadb4	ldur w26,[x29, #-0x58]
009dadb8	ldr x10,[x10, #0x258]
009dadbc	ldr x11,[x11, #0x218]
009dadc0	ldr x12,[x12, #0x250]
009dadc4	ldr x13,[x13, #0x210]
009dadc8	ldr x14,[x14, #0x238]
009dadcc	ldr x15,[x15, #0x1f8]
009dadd0	ldr x16,[x16, #0x230]
009dadd4	ldr x17,[x17, #0x1f0]
009dadd8	ldr x18,[x18, #0x260]
009daddc	ldr x0,[x0, #0x220]
009dade0	ldr x20,[sp, #0x20]
009dade4	adrp x25,0x74d000
009dade8	add x25,x25,#0x78
009dadec	b 0x009da8a4
009dadf0	bl 0x00c342a0
009dadf4	adrp x0,0x2db000
009dadf8	adrp x2,0x2b3000
009dadfc	add x0,x0,#0xc90
009dae00	add x2,x2,#0xf7d
009dae04	mov w1,#0x390
009dae08	b 0x009daf1c
009dae0c	bl 0x00c342a0
009dae10	adrp x0,0x2db000
009dae14	adrp x2,0x2b7000
009dae18	add x0,x0,#0xc90
009dae1c	add x2,x2,#0x820
009dae20	mov w1,#0x2bb
009dae24	b 0x009dae40
009dae28	bl 0x00c342a0
009dae2c	adrp x0,0x2db000
009dae30	adrp x2,0x2b7000
009dae34	add x0,x0,#0xc90
009dae38	add x2,x2,#0x820
009dae3c	mov w1,#0x284
009dae40	bl 0x00c342b0
009dae44	mov w2,#0x103
009dae48	mov w1,#0x50
009dae4c	movk w2,#0xc, LSL #16
009dae50	mov x0,x19
009dae54	mov x3,xzr
009dae58	bl 0x009da2d4
009dae5c	b 0x009daf40
009dae60	add x0,sp,#0x30
009dae64	bl 0x00c34340
009dae68	bl 0x00c342a0
009dae6c	adrp x0,0x2db000
009dae70	adrp x2,0x2b3000
009dae74	add x0,x0,#0xc90
009dae78	add x2,x2,#0xf7d
009dae7c	mov w1,#0x351
009dae80	b 0x009daf1c
009dae84	bl 0x00c342a0
009dae88	adrp x0,0x2db000
009dae8c	adrp x2,0x2b7000
009dae90	add x0,x0,#0xc90
009dae94	add x2,x2,#0x820
009dae98	mov w1,#0x263
009dae9c	bl 0x00c342b0
009daea0	mov w1,#0x2f
009daea4	mov w2,#0x98
009daea8	b 0x009dae50
009daeac	ldr w8,[x19, #0x64]
009daeb0	cbz w8,0x009daec0
009daeb4	ldr w8,[x19, #0x48]
009daeb8	cmp w8,#0x1
009daebc	b.eq 0x009daf40
009daec0	bl 0x00c342a0
009daec4	adrp x0,0x2db000
009daec8	adrp x2,0x2b7000
009daecc	add x0,x0,#0xc90
009daed0	add x2,x2,#0x820
009daed4	mov w1,#0x28e
009daed8	bl 0x00c342b0
009daedc	mov w1,#0x50
009daee0	mov w2,#0x100
009daee4	b 0x009dae50
009daee8	cmp w8,#0x4
009daeec	b.ne 0x009dafa4
009daef0	mov x22,xzr
009daef4	mov w21,#0x1
009daef8	b 0x009daf48
009daefc	add x0,sp,#0x30
009daf00	bl 0x00c34340
009daf04	bl 0x00c342a0
009daf08	adrp x0,0x2db000
009daf0c	adrp x2,0x2b3000
009daf10	add x0,x0,#0xc90
009daf14	add x2,x2,#0xf7d
009daf18	mov w1,#0x36a
009daf1c	bl 0x00c342b0
009daf20	mov w2,#0x103
009daf24	mov w1,#0x50
009daf28	movk w2,#0xc, LSL #16
009daf2c	mov x0,x19
009daf30	mov x3,xzr
009daf34	bl 0x009da2d4
009daf38	ldur w26,[x29, #-0x58]
009daf3c	ldr x20,[sp, #0x20]
009daf40	mov x22,xzr
009daf44	mov w21,#0xffffffff
009daf48	ldr w8,[x19, #0x6c]
009daf4c	mov x0,x22
009daf50	sub w8,w8,#0x1
009daf54	str w8,[x19, #0x6c]
009daf58	bl 0x00c35660
009daf5c	cbz x20,0x009daf7c
009daf60	cbz w26,0x009daf6c
009daf64	mov w1,#0x2002
009daf68	b 0x009daf70
009daf6c	mov w1,#0x1002
009daf70	mov x0,x19
009daf74	mov w2,w21
009daf78	blr x20
009daf7c	mov w0,w21
009daf80	ldp x29,x30,[sp, #0xd0]
009daf84	ldp x20,x19,[sp, #0xc0]
009daf88	ldp x22,x21,[sp, #0xb0]
009daf8c	ldp x24,x23,[sp, #0xa0]
009daf90	ldp x26,x25,[sp, #0x90]
009daf94	ldp x28,x27,[sp, #0x80]
009daf98	ldr d8,[sp, #0x70]
009daf9c	add sp,sp,#0xe0
009dafa0	ret
009dafa4	cmp w8,#0x1
009dafa8	b.ne 0x009dafb4
009dafac	ldr w8,[x19, #0x64]
009dafb0	cbnz w8,0x009dafe4
009dafb4	bl 0x00c342a0
009dafb8	adrp x0,0x2db000
009dafbc	adrp x2,0x2a3000
009dafc0	add x0,x0,#0xc90
009dafc4	add x2,x2,#0xd76
009dafc8	mov w1,#0x1cf
009dafcc	bl 0x00c342b0
009dafd0	mov w1,#0x50
009dafd4	mov w2,#0x100
009dafd8	mov x0,x19
009dafdc	mov x3,xzr
009dafe0	bl 0x009da2d4
009dafe4	bl 0x00c342a0
009dafe8	adrp x0,0x2db000
009dafec	adrp x2,0x2a3000
009daff0	add x0,x0,#0xc90
009daff4	add x2,x2,#0xd76
009daff8	mov w1,#0x1d0
009daffc	bl 0x00c342b0
009db000	mov w8,#0x103
009db004	movk w8,#0xc, LSL #16
009db008	sub w1,w8,#0x2
009db00c	mov w0,#0x14
009db010	mov x2,xzr
009db014	bl 0x00c342c0
009db018	b 0x009daf40
009db01c	add x0,sp,#0x30
009db020	bl 0x00c34340
009db024	ldr w8,[x19, #0x64]
009db028	cbz w8,0x009db038
009db02c	ldr w8,[x19, #0x48]
009db030	cmp w8,#0x1
009db034	b.eq 0x009daf38
009db038	bl 0x00c342a0
009db03c	adrp x0,0x2db000
009db040	adrp x2,0x2b3000
009db044	add x0,x0,#0xc90
009db048	add x2,x2,#0xf7d
009db04c	mov w1,#0x35a
009db050	b 0x009db10c
009db054	bl 0x00c342a0
009db058	adrp x0,0x2db000
009db05c	adrp x2,0x2b7000
009db060	add x0,x0,#0xc90
009db064	add x2,x2,#0x820
009db068	mov w1,#0x26c
009db06c	bl 0x00c342b0
009db070	mov w2,#0x7
009db074	mov w1,#0x50
009db078	movk w2,#0x8, LSL #16
009db07c	b 0x009daf2c
009db080	ldr w8,[x19, #0x64]
009db084	cbz w8,0x009db094
009db088	ldr w8,[x19, #0x48]
009db08c	cmp w8,#0x1
009db090	b.eq 0x009daf38
009db094	bl 0x00c342a0
009db098	adrp x0,0x2db000
009db09c	adrp x2,0x2b3000
009db0a0	add x0,x0,#0xc90
009db0a4	add x2,x2,#0xf7d
009db0a8	mov w1,#0x32e
009db0ac	b 0x009db10c
009db0b0	ldr w8,[x19, #0x64]
009db0b4	cbz w8,0x009db0c4
009db0b8	ldr w8,[x19, #0x48]
009db0bc	cmp w8,#0x1
009db0c0	b.eq 0x009daf38
009db0c4	bl 0x00c342a0
009db0c8	adrp x0,0x2db000
009db0cc	adrp x2,0x2b3000
009db0d0	add x0,x0,#0xc90
009db0d4	add x2,x2,#0xf7d
009db0d8	mov w1,#0x37f
009db0dc	b 0x009db10c
009db0e0	ldr w8,[x19, #0x64]
009db0e4	cbz w8,0x009db0f4
009db0e8	ldr w8,[x19, #0x48]
009db0ec	cmp w8,#0x1
009db0f0	b.eq 0x009daf38
009db0f4	bl 0x00c342a0
009db0f8	adrp x0,0x2db000
009db0fc	adrp x2,0x2b3000
009db100	add x0,x0,#0xc90
009db104	add x2,x2,#0xf7d
009db108	mov w1,#0x336
009db10c	bl 0x00c342b0
009db110	mov w1,#0x50
009db114	mov w2,#0x100
009db118	b 0x009daf2c
009db11c	ldr w8,[x19, #0x64]
009db120	cbz w8,0x009db130
009db124	ldr w8,[x19, #0x48]
009db128	cmp w8,#0x1
009db12c	b.eq 0x009daf40
009db130	bl 0x00c342a0
009db134	adrp x0,0x2db000
009db138	adrp x2,0x2b7000
009db13c	add x0,x0,#0xc90
009db140	add x2,x2,#0x820
009db144	mov w1,#0x2a6
009db148	b 0x009daed8
