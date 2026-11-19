; SRP_VBASE_init @ 00ae75a0
00ae75a0	stp x28,x27,[sp, #-0x60]!
00ae75a4	stp x26,x25,[sp, #0x10]
00ae75a8	stp x24,x23,[sp, #0x20]
00ae75ac	stp x22,x21,[sp, #0x30]
00ae75b0	stp x20,x19,[sp, #0x40]
00ae75b4	stp x29,x30,[sp, #0x50]
00ae75b8	add x29,sp,#0x50
00ae75bc	sub sp,sp,#0x9e0
00ae75c0	mov x21,x1
00ae75c4	mov x22,x0
00ae75c8	bl 0x00c34780
00ae75cc	mov x19,x0
00ae75d0	bl 0x00c32270
00ae75d4	bl 0x00c32240
00ae75d8	mov x20,x0
00ae75dc	cbz x0,0x00ae78fc
00ae75e0	mov w1,#0x6c
00ae75e4	orr w2,wzr,#0x3
00ae75e8	mov x0,x20
00ae75ec	mov x3,x21
00ae75f0	orr w24,wzr,#0x3
00ae75f4	bl 0x00c321a0
00ae75f8	cmp w0,#0x1
00ae75fc	b.lt 0x00ae7908
00ae7600	orr w1,wzr,#0x6
00ae7604	mov x0,x20
00ae7608	bl 0x00c40210
00ae760c	mov x21,x0
00ae7610	cbz x0,0x00ae7910
00ae7614	ldr x8,[x22, #0x10]
00ae7618	cbz x8,0x00ae7628
00ae761c	mov x0,xzr
00ae7620	bl 0x00c36a70
00ae7624	ldr x8,[x0]
00ae7628	ldr x0,[x21, #0x8]
00ae762c	str x8,[sp, #0x8]
00ae7630	bl 0x00c325e0
00ae7634	cmp w0,#0x1
00ae7638	b.lt 0x00ae7884
00ae763c	adrp x26,0x2ce000
00ae7640	mov w25,wzr
00ae7644	mov w24,#0x4
00ae7648	add x26,x26,#0x365
00ae764c	ldr x0,[x21, #0x8]
00ae7650	mov w1,w25
00ae7654	bl 0x00c32610
00ae7658	ldr x8,[x0]
00ae765c	mov x27,x0
00ae7660	ldrb w8,[x8]
00ae7664	cmp w8,#0x56
00ae7668	b.eq 0x00ae76f4
00ae766c	cmp w8,#0x49
00ae7670	b.ne 0x00ae7870
00ae7674	orr w0,wzr,#0x18
00ae7678	mov w2,#0x1af
00ae767c	mov x1,x26
00ae7680	bl 0x00c32320
00ae7684	cbz x0,0x00ae79a8
00ae7688	mov x28,x0
00ae768c	ldr x0,[x27, #0x18]
00ae7690	mov w2,#0x1b2
00ae7694	mov x1,x26
00ae7698	bl 0x00c34600
00ae769c	str x0,[x28]
00ae76a0	cbz x0,0x00ae7918
00ae76a4	ldr x0,[x22, #0x8]
00ae76a8	ldr x1,[x27, #0x8]
00ae76ac	bl 0x00ae79ec
00ae76b0	str x0,[x28, #0x10]
00ae76b4	cbz x0,0x00ae7918
00ae76b8	ldr x0,[x22, #0x8]
00ae76bc	ldr x1,[x27, #0x10]
00ae76c0	bl 0x00ae79ec
00ae76c4	str x0,[x28, #0x8]
00ae76c8	cbz x0,0x00ae7918
00ae76cc	mov x0,x19
00ae76d0	mov x1,x28
00ae76d4	mov w2,wzr
00ae76d8	bl 0x00c35890
00ae76dc	cbz w0,0x00ae7918
00ae76e0	ldr x8,[x22, #0x10]
00ae76e4	cbz x8,0x00ae7870
00ae76e8	ldr x8,[x27, #0x18]
00ae76ec	str x8,[sp, #0x8]
00ae76f0	b 0x00ae7870
00ae76f4	ldr x28,[x27, #0x20]
00ae76f8	cbz x19,0x00ae774c
00ae76fc	mov x0,x19
00ae7700	bl 0x00c325e0
00ae7704	cmp w0,#0x1
00ae7708	b.lt 0x00ae774c
00ae770c	mov w26,wzr
00ae7710	mov x0,x19
00ae7714	mov w1,w26
00ae7718	bl 0x00c32610
00ae771c	cbz x0,0x00ae7738
00ae7720	mov x23,x0
00ae7724	cbz x28,0x00ae7758
00ae7728	ldr x0,[x23]
00ae772c	mov x1,x28
00ae7730	bl 0x00c301f0
00ae7734	cbz w0,0x00ae7758
00ae7738	mov x0,x19
00ae773c	add w26,w26,#0x1
00ae7740	bl 0x00c325e0
00ae7744	cmp w26,w0
00ae7748	b.lt 0x00ae7710
00ae774c	mov x0,x28
00ae7750	bl 0x00c36a70
00ae7754	mov x23,x0
00ae7758	adrp x26,0x2ce000
00ae775c	add x26,x26,#0x365
00ae7760	cbz x23,0x00ae7870
00ae7764	orr w0,wzr,#0x30
00ae7768	mov w2,#0xc2
00ae776c	mov x1,x26
00ae7770	bl 0x00c32320
00ae7774	cbz x0,0x00ae79e4
00ae7778	movi v0.2D,#0x0
00ae777c	stp q0,q0,[x0, #0x10]
00ae7780	str q0,[x0]
00ae7784	ldur q0,[x23, #0x8]
00ae7788	mov x28,x0
00ae778c	mov w2,#0xd9
00ae7790	mov x1,x26
00ae7794	stur q0,[x0, #0x18]
00ae7798	ldr x24,[x27, #0x18]
00ae779c	ldr x23,[x27, #0x28]
00ae77a0	mov x0,xzr
00ae77a4	bl 0x00c32310
00ae77a8	ldr x0,[x28, #0x28]
00ae77ac	mov w2,#0xda
00ae77b0	mov x1,x26
00ae77b4	bl 0x00c32310
00ae77b8	cbz x24,0x00ae77d4
00ae77bc	mov w2,#0xdb
00ae77c0	mov x0,x24
00ae77c4	mov x1,x26
00ae77c8	bl 0x00c34600
00ae77cc	str x0,[x28]
00ae77d0	cbz x0,0x00ae7954
00ae77d4	cbz x23,0x00ae77f0
00ae77d8	mov w2,#0xdd
00ae77dc	mov x0,x23
00ae77e0	mov x1,x26
00ae77e4	bl 0x00c34600
00ae77e8	str x0,[x28, #0x28]
00ae77ec	cbz x0,0x00ae7954
00ae77f0	ldp x1,x23,[x27, #0x8]
00ae77f4	mov x27,x28
00ae77f8	str xzr,[x27, #0x8]!
00ae77fc	mov x26,x27
00ae7800	add x0,sp,#0x14
00ae7804	str xzr,[x26, #0x8]!
00ae7808	bl 0x00ae8258
00ae780c	tbnz w0,#0x1f,0x00ae794c
00ae7810	mov w1,w0
00ae7814	add x0,sp,#0x14
00ae7818	mov x2,xzr
00ae781c	bl 0x00c36970
00ae7820	str x0,[x26]
00ae7824	cbz x0,0x00ae794c
00ae7828	add x0,sp,#0x14
00ae782c	mov x1,x23
00ae7830	bl 0x00ae8258
00ae7834	tbnz w0,#0x1f,0x00ae7940
00ae7838	mov w1,w0
00ae783c	add x0,sp,#0x14
00ae7840	mov x2,xzr
00ae7844	bl 0x00c36970
00ae7848	str x0,[x27]
00ae784c	cbz x0,0x00ae7940
00ae7850	ldr x0,[x22]
00ae7854	mov x1,x28
00ae7858	mov w2,wzr
00ae785c	bl 0x00c35890
00ae7860	adrp x26,0x2ce000
00ae7864	mov w24,#0x2
00ae7868	add x26,x26,#0x365
00ae786c	cbz w0,0x00ae7958
00ae7870	ldr x0,[x21, #0x8]
00ae7874	add w25,w25,#0x1
00ae7878	bl 0x00c325e0
00ae787c	cmp w25,w0
00ae7880	b.lt 0x00ae764c
00ae7884	ldr x24,[sp, #0x8]
00ae7888	cbz x24,0x00ae79a8
00ae788c	cbz x19,0x00ae78dc
00ae7890	mov x0,x19
00ae7894	bl 0x00c325e0
00ae7898	cmp w0,#0x1
00ae789c	b.lt 0x00ae78dc
00ae78a0	mov w23,wzr
00ae78a4	mov x0,x19
00ae78a8	mov w1,w23
00ae78ac	bl 0x00c32610
00ae78b0	cbz x0,0x00ae78c8
00ae78b4	mov x25,x0
00ae78b8	ldr x0,[x0]
00ae78bc	mov x1,x24
00ae78c0	bl 0x00c301f0
00ae78c4	cbz w0,0x00ae78e8
00ae78c8	mov x0,x19
00ae78cc	add w23,w23,#0x1
00ae78d0	bl 0x00c325e0
00ae78d4	cmp w23,w0
00ae78d8	b.lt 0x00ae78a4
00ae78dc	mov x0,x24
00ae78e0	bl 0x00c36a70
00ae78e4	mov x25,x0
00ae78e8	cbz x25,0x00ae7938
00ae78ec	ldur q0,[x25, #0x8]
00ae78f0	mov w24,wzr
00ae78f4	stur q0,[x22, #0x18]
00ae78f8	b 0x00ae79a8
00ae78fc	mov x21,xzr
00ae7900	orr w24,wzr,#0x3
00ae7904	b 0x00ae79a8
00ae7908	mov x21,xzr
00ae790c	b 0x00ae79a8
00ae7910	mov w24,#0x1
00ae7914	b 0x00ae79a8
00ae7918	ldr x0,[x28]
00ae791c	adrp x22,0x2ce000
00ae7920	add x22,x22,#0x365
00ae7924	mov w2,#0x1ed
00ae7928	mov x1,x22
00ae792c	bl 0x00c32310
00ae7930	mov w2,#0x1ee
00ae7934	b 0x00ae799c
00ae7938	mov w24,#0x2
00ae793c	b 0x00ae79a8
00ae7940	ldr x0,[x26]
00ae7944	bl 0x00c36290
00ae7948	str xzr,[x26]
00ae794c	mov w24,#0x2
00ae7950	b 0x00ae7960
00ae7954	mov w24,#0x4
00ae7958	add x27,x28,#0x8
00ae795c	add x26,x28,#0x10
00ae7960	ldr x0,[x27]
00ae7964	bl 0x00c36290
00ae7968	ldr x0,[x26]
00ae796c	bl 0x00c322e0
00ae7970	ldr x0,[x28]
00ae7974	adrp x22,0x2ce000
00ae7978	add x22,x22,#0x365
00ae797c	mov w2,#0xb9
00ae7980	mov x1,x22
00ae7984	bl 0x00c32310
00ae7988	ldr x0,[x28, #0x28]
00ae798c	mov w2,#0xba
00ae7990	mov x1,x22
00ae7994	bl 0x00c32310
00ae7998	mov w2,#0xbb
00ae799c	mov x0,x28
00ae79a0	mov x1,x22
00ae79a4	bl 0x00c32310
00ae79a8	mov x0,x21
00ae79ac	bl 0x00c40200
00ae79b0	mov x0,x20
00ae79b4	bl 0x00c355e0
00ae79b8	mov x0,x19
00ae79bc	bl 0x00c34770
00ae79c0	mov w0,w24
00ae79c4	add sp,sp,#0x9e0
00ae79c8	ldp x29,x30,[sp, #0x50]
00ae79cc	ldp x20,x19,[sp, #0x40]
00ae79d0	ldp x22,x21,[sp, #0x30]
00ae79d4	ldp x24,x23,[sp, #0x20]
00ae79d8	ldp x26,x25,[sp, #0x10]
00ae79dc	ldp x28,x27,[sp], #0x60
00ae79e0	ret
00ae79e4	mov w24,#0x4
00ae79e8	b 0x00ae79a8
