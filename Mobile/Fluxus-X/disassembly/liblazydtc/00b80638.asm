; FUN_00b80638 @ 00b80638
00b80638	sub sp,sp,#0xa0
00b8063c	stp x28,x27,[sp, #0x40]
00b80640	stp x26,x25,[sp, #0x50]
00b80644	stp x24,x23,[sp, #0x60]
00b80648	stp x22,x21,[sp, #0x70]
00b8064c	stp x20,x19,[sp, #0x80]
00b80650	stp x29,x30,[sp, #0x90]
00b80654	add x29,sp,#0x90
00b80658	mrs x24,tpidr_el0
00b8065c	ldr x8,[x24, #0x28]
00b80660	mov x20,x5
00b80664	mov x21,x4
00b80668	mov w26,w3
00b8066c	str x8,[sp, #0x38]
00b80670	ldrh w8,[x4, #0xa]
00b80674	mov x22,x2
00b80678	mov x23,x1
00b8067c	mov x19,x0
00b80680	sub x8,x8,#0x1
00b80684	cmn x8,#0x1
00b80688	b.eq 0x00b80700
00b8068c	ldr x9,[x21]
00b80690	ldr x9,[x9, x8, LSL #0x3]
00b80694	sub x8,x8,#0x1
00b80698	cbz x9,0x00b80684
00b8069c	ldrsh w8,[x21, #0x8]
00b806a0	cmp w8,#0x1
00b806a4	b.lt 0x00b80700
00b806a8	ldr x8,[x21]
00b806ac	ldrb w8,[x8]
00b806b0	tbz w8,#0x0,0x00b80700
00b806b4	ldrh w1,[x22, #0xa]
00b806b8	sub x8,x1,#0x1
00b806bc	cmn x8,#0x1
00b806c0	b.eq 0x00b806dc
00b806c4	ldr x9,[x22]
00b806c8	ldr x9,[x9, x8, LSL #0x3]
00b806cc	sub x8,x8,#0x1
00b806d0	cbz x9,0x00b806bc
00b806d4	ldrsh w8,[x22, #0x8]
00b806d8	tbnz w8,#0x1f,0x00b80700
00b806dc	ldr x0,[x22]
00b806e0	bl 0x00c41dc0
00b806e4	cmp x0,#0x2, LSL #12
00b806e8	b.hi 0x00b80700
00b806ec	ldr x0,[x21]
00b806f0	ldrh w1,[x21, #0xa]
00b806f4	bl 0x00c41dc0
00b806f8	cmp x0,#0x2, LSL #12
00b806fc	b.ls 0x00b80738
00b80700	orr w27,wzr,#0xfffffffc
00b80704	ldr x8,[x24, #0x28]
00b80708	ldr x9,[sp, #0x38]
00b8070c	cmp x8,x9
00b80710	b.ne 0x00b80b34
00b80714	mov w0,w27
00b80718	ldp x29,x30,[sp, #0x90]
00b8071c	ldp x20,x19,[sp, #0x80]
00b80720	ldp x22,x21,[sp, #0x70]
00b80724	ldp x24,x23,[sp, #0x60]
00b80728	ldp x26,x25,[sp, #0x50]
00b8072c	ldp x28,x27,[sp, #0x40]
00b80730	add sp,sp,#0xa0
00b80734	ret
00b80738	ldrh w1,[x22, #0xa]
00b8073c	cbz x1,0x00b80798
00b80740	ldrh w0,[x21, #0xa]
00b80744	bl 0x00c41e20
00b80748	mov w1,#0x8
00b8074c	mov x25,x0
00b80750	bl 0x00c30a30
00b80754	cbz x0,0x00b80844
00b80758	mov w8,#0x1
00b8075c	str w8,[sp, #0x28]
00b80760	str xzr,[sp, #0x20]
00b80764	cbz x20,0x00b807ac
00b80768	ldr x28,[x20]
00b8076c	cbz x28,0x00b807ac
00b80770	ldrh w27,[x21, #0xa]
00b80774	mov w8,#0x2710
00b80778	cmp x27,x8
00b8077c	b.ls 0x00b8084c
00b80780	lsl x1,x25,#0x3
00b80784	bl 0x00c42230
00b80788	orr w27,wzr,#0xfffffff0
00b8078c	ldr x8,[x20]
00b80790	cbnz x8,0x00b80704
00b80794	b 0x00b80b10
00b80798	ldrh w22,[x19, #0xa]
00b8079c	cbz x22,0x00b807d4
00b807a0	ldr x20,[x19]
00b807a4	lsl x2,x22,#0x3
00b807a8	b 0x00b80820
00b807ac	str x0,[sp, #0x18]
00b807b0	add x0,sp,#0x20
00b807b4	mov x1,x21
00b807b8	bl 0x00c41e50
00b807bc	mov w27,w0
00b807c0	cbnz w0,0x00b80af8
00b807c4	cbz x20,0x00b808b0
00b807c8	ldr q0,[sp, #0x20]
00b807cc	str q0,[x20]
00b807d0	b 0x00b808b0
00b807d4	mov w0,#0x1
00b807d8	mov w1,#0x8
00b807dc	bl 0x00c30a30
00b807e0	mov x20,x0
00b807e4	cbz x0,0x00b80844
00b807e8	ldr x21,[x19]
00b807ec	cbz x21,0x00b80810
00b807f0	lsl x22,x22,#0x3
00b807f4	mov x0,x20
00b807f8	mov x1,x21
00b807fc	mov x2,x22
00b80800	bl 0x00c2ffd0
00b80804	mov x0,x21
00b80808	mov x1,x22
00b8080c	bl 0x00c42230
00b80810	mov w8,#0x1
00b80814	mov w2,#0x8
00b80818	str x20,[x19]
00b8081c	strh w8,[x19, #0xa]
00b80820	mov x0,x20
00b80824	mov w1,wzr
00b80828	bl 0x00c301c0
00b8082c	ldr x8,[x19]
00b80830	mov w9,#0x1
00b80834	mov w27,wzr
00b80838	str x9,[x8]
00b8083c	strh w9,[x19, #0x8]
00b80840	b 0x00b80704
00b80844	orr w27,wzr,#0xfffffff0
00b80848	b 0x00b80704
00b8084c	ldrh w8,[x20, #0xa]
00b80850	str x0,[sp, #0x18]
00b80854	cmp w8,w27
00b80858	b.cs 0x00b808a8
00b8085c	mov w1,#0x8
00b80860	mov x0,x27
00b80864	str x8,[sp, #0x10]
00b80868	bl 0x00c30a30
00b8086c	mov x8,x0
00b80870	ldr x0,[sp, #0x18]
00b80874	cbz x8,0x00b80780
00b80878	ldr x9,[sp, #0x10]
00b8087c	mov x0,x8
00b80880	mov x1,x28
00b80884	lsl x2,x9,#0x3
00b80888	stp x2,x8,[sp, #0x8]
00b8088c	bl 0x00c2ffd0
00b80890	ldr x1,[sp, #0x8]
00b80894	mov x0,x28
00b80898	bl 0x00c42230
00b8089c	ldr x8,[sp, #0x10]
00b808a0	strh w27,[x20, #0xa]
00b808a4	str x8,[x20]
00b808a8	ldr q0,[x20]
00b808ac	str q0,[sp, #0x20]
00b808b0	mov x0,x19
00b808b4	mov x1,x23
00b808b8	bl 0x00c41b60
00b808bc	mov w27,w0
00b808c0	cbnz w0,0x00b80af8
00b808c4	ldrh w8,[x19, #0xa]
00b808c8	mov w9,#0x1
00b808cc	strh w9,[x19, #0x8]
00b808d0	sub x8,x8,#0x1
00b808d4	cmn x8,#0x1
00b808d8	b.eq 0x00b808f4
00b808dc	ldr x9,[x19]
00b808e0	ldr x9,[x9, x8, LSL #0x3]
00b808e4	sub x8,x8,#0x1
00b808e8	cbz x9,0x00b808d4
00b808ec	add x8,x8,#0x2
00b808f0	b 0x00b808f8
00b808f4	mov x8,xzr
00b808f8	ldrh w27,[x21, #0xa]
00b808fc	sub x9,x27,#0x1
00b80900	cmn x9,#0x1
00b80904	b.eq 0x00b80928
00b80908	ldr x10,[x21]
00b8090c	ldr x10,[x10, x9, LSL #0x3]
00b80910	sub x9,x9,#0x1
00b80914	cbz x10,0x00b80900
00b80918	add x9,x9,#0x2
00b8091c	cmp x8,x9
00b80920	b.ls 0x00b80934
00b80924	b 0x00b80990
00b80928	mov x9,xzr
00b8092c	cmp x8,x9
00b80930	b.hi 0x00b80990
00b80934	orr x10,x9,x8
00b80938	cbz x10,0x00b80990
00b8093c	ldrsh w10,[x21, #0x8]
00b80940	cmp x9,x8
00b80944	b.ls 0x00b80954
00b80948	cmp w10,#0x0
00b8094c	b.gt 0x00b809ac
00b80950	b 0x00b80990
00b80954	tbnz w10,#0x1f,0x00b80990
00b80958	sub x8,x8,#0x1
00b8095c	cmn x8,#0x1
00b80960	b.eq 0x00b80990
00b80964	ldr x9,[x19]
00b80968	ldr x10,[x21]
00b8096c	lsl x11,x8,#0x3
00b80970	ldr x9,[x9, x11#0x0]
00b80974	ldr x10,[x10, x11#0x0]
00b80978	cmp x9,x10
00b8097c	b.hi 0x00b80990
00b80980	cmp x9,x10
00b80984	sub x8,x8,#0x1
00b80988	b.cs 0x00b8095c
00b8098c	b 0x00b809ac
00b80990	mov x0,x19
00b80994	mov x1,x19
00b80998	mov x2,x21
00b8099c	bl 0x00c41c60
00b809a0	mov w27,w0
00b809a4	cbnz w0,0x00b80af8
00b809a8	ldrh w27,[x21, #0xa]
00b809ac	mov w8,#0x2710
00b809b0	cmp w27,w8
00b809b4	b.ls 0x00b809c0
00b809b8	orr w27,wzr,#0xfffffff0
00b809bc	b 0x00b80af8
00b809c0	ldrh w28,[x19, #0xa]
00b809c4	cmp w28,w27
00b809c8	b.cs 0x00b80a10
00b809cc	mov w1,#0x8
00b809d0	mov x0,x27
00b809d4	bl 0x00c30a30
00b809d8	cbz x0,0x00b809b8
00b809dc	ldr x8,[x19]
00b809e0	cbz x8,0x00b80a08
00b809e4	lsl x2,x28,#0x3
00b809e8	mov x1,x8
00b809ec	stp x2,x0,[sp, #0x8]
00b809f0	mov x28,x8
00b809f4	bl 0x00c2ffd0
00b809f8	ldr x1,[sp, #0x8]
00b809fc	mov x0,x28
00b80a00	bl 0x00c42230
00b80a04	ldr x0,[sp, #0x10]
00b80a08	strh w27,[x19, #0xa]
00b80a0c	str x0,[x19]
00b80a10	ldr x0,[x21]
00b80a14	bl 0x00c41e90
00b80a18	ldr x1,[x19]
00b80a1c	ldp x28,x5,[sp, #0x18]
00b80a20	ldr x2,[x21]
00b80a24	ldrh w3,[x21, #0xa]
00b80a28	mov x27,x0
00b80a2c	mov x0,x1
00b80a30	mov x4,x27
00b80a34	mov x6,x28
00b80a38	bl 0x00c41f20
00b80a3c	ldr x0,[x19]
00b80a40	ldr x2,[x21]
00b80a44	ldrh w3,[x21, #0xa]
00b80a48	ldr x4,[x22]
00b80a4c	ldrh w5,[x22, #0xa]
00b80a50	ldr x6,[sp, #0x20]
00b80a54	mov w8,#0x2a2a
00b80a58	movk w8,#0x2a2a, LSL #16
00b80a5c	mov x1,x0
00b80a60	mov x7,x28
00b80a64	cmp w26,w8
00b80a68	b.ne 0x00b80a74
00b80a6c	bl 0x00c41e10
00b80a70	b 0x00b80a78
00b80a74	bl 0x00c41e00
00b80a78	ldr x0,[x19]
00b80a7c	ldr x2,[x21]
00b80a80	ldrh w3,[x21, #0xa]
00b80a84	mov x4,x27
00b80a88	mov x1,x0
00b80a8c	mov x5,x28
00b80a90	bl 0x00c41e40
00b80a94	ldrsh w8,[x23, #0x8]
00b80a98	mov w27,wzr
00b80a9c	cmn w8,#0x1
00b80aa0	b.ne 0x00b80af8
00b80aa4	ldr x8,[x22]
00b80aa8	mov w27,wzr
00b80aac	ldrb w8,[x8]
00b80ab0	tbz w8,#0x0,0x00b80af8
00b80ab4	ldr x0,[x19]
00b80ab8	ldrh w1,[x19, #0xa]
00b80abc	bl 0x00c41dd0
00b80ac0	mov x8,xzr
00b80ac4	mov w9,#0x2
00b80ac8	and x8,x8,x0
00b80acc	mvn x0,x0
00b80ad0	and x0,x0,x9
00b80ad4	orr x0,x8,x0
00b80ad8	sub w8,w0,#0x1
00b80adc	mov w3,#0x1
00b80ae0	mov x0,x19
00b80ae4	mov x1,x21
00b80ae8	mov x2,x19
00b80aec	strh w8,[x19, #0x8]
00b80af0	bl 0x00b7f304
00b80af4	mov w27,w0
00b80af8	ldr x0,[sp, #0x18]
00b80afc	lsl x1,x25,#0x3
00b80b00	bl 0x00c42230
00b80b04	cbz x20,0x00b80b10
00b80b08	ldr x8,[x20]
00b80b0c	cbnz x8,0x00b80704
00b80b10	ldr x0,[sp, #0x20]
00b80b14	cbz x0,0x00b80b24
00b80b18	ldrh w8,[sp, #0x2a]
00b80b1c	lsl x1,x8,#0x3
00b80b20	bl 0x00c42230
00b80b24	mov w8,#0x1
00b80b28	str w8,[sp, #0x28]
00b80b2c	str xzr,[sp, #0x20]
00b80b30	b 0x00b80704
00b80b34	bl 0x00c2fec0
