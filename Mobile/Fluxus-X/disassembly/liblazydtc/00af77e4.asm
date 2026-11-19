; FUN_00af77e4 @ 00af77e4
00af77e4	sub sp,sp,#0x70
00af77e8	mov x0,x1
00af77ec	stp x28,x27,[sp, #0x10]
00af77f0	stp x26,x25,[sp, #0x20]
00af77f4	stp x24,x23,[sp, #0x30]
00af77f8	stp x22,x21,[sp, #0x40]
00af77fc	stp x20,x19,[sp, #0x50]
00af7800	stp x29,x30,[sp, #0x60]
00af7804	add x29,sp,#0x60
00af7808	mov w19,w3
00af780c	mov x20,x2
00af7810	mov x21,x1
00af7814	bl 0x00c325e0
00af7818	cmp w0,#0x1
00af781c	b.lt 0x00af7b00
00af7820	adrp x25,0x2ab000
00af7824	adrp x28,0x2bb000
00af7828	mov w22,wzr
00af782c	add w23,w19,#0x2
00af7830	add x25,x25,#0x32c
00af7834	add x28,x28,#0x9d8
00af7838	str w19,[sp, #0xc]
00af783c	b 0x00af785c
00af7840	adrp x1,0x2ca000
00af7844	mov x0,x20
00af7848	add x1,x1,#0x454
00af784c	mov w2,w19
00af7850	mov x3,x25
00af7854	bl 0x00c32250
00af7858	b 0x00af78dc
00af785c	mov x0,x21
00af7860	mov w1,w22
00af7864	bl 0x00c32610
00af7868	mov x27,x0
00af786c	cbz x0,0x00af78bc
00af7870	ldr x9,[x27]
00af7874	cbz x9,0x00af78bc
00af7878	ldr x8,[x9, #0x8]
00af787c	cbz x8,0x00af78bc
00af7880	ldr w9,[x9]
00af7884	mov w26,wzr
00af7888	cmp w9,#0x2
00af788c	b.lt 0x00af78c0
00af7890	ldrb w9,[x8]
00af7894	ldrb w26,[x8, #0x1]
00af7898	bfm w26,w9,#0x18,#0x7
00af789c	cmp w26,#0x2
00af78a0	b.eq 0x00af7840
00af78a4	cmp w26,#0x1
00af78a8	b.ne 0x00af78c0
00af78ac	adrp x1,0x2be000
00af78b0	mov x0,x20
00af78b4	add x1,x1,#0x408
00af78b8	b 0x00af784c
00af78bc	mov w26,wzr
00af78c0	adrp x1,0x2ae000
00af78c4	mov x0,x20
00af78c8	add x1,x1,#0x781
00af78cc	mov w2,w19
00af78d0	mov x3,x25
00af78d4	mov w4,w26
00af78d8	bl 0x00c32250
00af78dc	ldr x8,[x27]
00af78e0	ldr w9,[x8]
00af78e4	cmp w9,#0x3
00af78e8	b.lt 0x00af79b0
00af78ec	ldr x8,[x8, #0x8]
00af78f0	ldrb w2,[x8, #0x2]
00af78f4	sub w8,w2,#0x1
00af78f8	cmp w8,#0x41
00af78fc	b.hi 0x00af7924
00af7900	adrp x9,0x77b000
00af7904	add x9,x9,#0x48c
00af7908	ldrsw x8,[x9, x8, LSL #0x2]
00af790c	add x8,x8,x9
00af7910	br x8
00af7914	adrp x1,0x2da000
00af7918	mov x0,x20
00af791c	add x1,x1,#0x673
00af7920	b 0x00af79ac
00af7924	cmp w2,#0x80
00af7928	b.ne 0x00af793c
00af792c	adrp x1,0x2d2000
00af7930	mov x0,x20
00af7934	add x1,x1,#0x3b3
00af7938	b 0x00af79ac
00af793c	adrp x1,0x2c6000
00af7940	mov x0,x20
00af7944	add x1,x1,#0x2b4
00af7948	bl 0x00c32250
00af794c	b 0x00af79b0
00af7950	adrp x1,0x2c8000
00af7954	mov x0,x20
00af7958	add x1,x1,#0x392
00af795c	b 0x00af79ac
00af7960	adrp x1,0x2b0000
00af7964	mov x0,x20
00af7968	add x1,x1,#0x951
00af796c	b 0x00af79ac
00af7970	adrp x1,0x29e000
00af7974	mov x0,x20
00af7978	add x1,x1,#0xaef
00af797c	b 0x00af79ac
00af7980	adrp x1,0x2c2000
00af7984	mov x0,x20
00af7988	add x1,x1,#0x4ca
00af798c	b 0x00af79ac
00af7990	adrp x1,0x2ba000
00af7994	mov x0,x20
00af7998	add x1,x1,#0x799
00af799c	b 0x00af79ac
00af79a0	adrp x1,0x2a0000
00af79a4	mov x0,x20
00af79a8	add x1,x1,#0xcda
00af79ac	bl 0x00c32260
00af79b0	ldr x8,[x27, #0x8]
00af79b4	ldr w8,[x8]
00af79b8	cmp w8,#0x1
00af79bc	b.eq 0x00af79d8
00af79c0	cbnz w8,0x00af7ae8
00af79c4	adrp x1,0x2ce000
00af79c8	mov x0,x20
00af79cc	add x1,x1,#0x422
00af79d0	bl 0x00c32260
00af79d4	b 0x00af7ae8
00af79d8	adrp x1,0x2b2000
00af79dc	mov x0,x20
00af79e0	add x1,x1,#0xc4d
00af79e4	bl 0x00c32260
00af79e8	ldr x8,[x27, #0x8]
00af79ec	ldr x27,[x8, #0x8]
00af79f0	mov x0,x27
00af79f4	bl 0x00c325e0
00af79f8	cmp w0,#0x1
00af79fc	b.lt 0x00af7ae8
00af7a00	mov w24,wzr
00af7a04	mov x0,x27
00af7a08	mov w1,w24
00af7a0c	bl 0x00c32610
00af7a10	mov x19,x0
00af7a14	mov x0,x20
00af7a18	mov x1,x28
00af7a1c	mov w2,w23
00af7a20	mov x3,x25
00af7a24	bl 0x00c32250
00af7a28	ldr w8,[x19]
00af7a2c	cmp w8,#0x1
00af7a30	b.eq 0x00af7a7c
00af7a34	cbnz w8,0x00af7ad4
00af7a38	ldr x3,[x19, #0x8]
00af7a3c	mov x0,x20
00af7a40	mov w1,w26
00af7a44	mov w2,wzr
00af7a48	bl 0x00af86d8
00af7a4c	cbz w0,0x00af7b04
00af7a50	ldr x8,[x19, #0x8]
00af7a54	adrp x1,0x2c6000
00af7a58	mov x0,x20
00af7a5c	add x1,x1,#0x2c7
00af7a60	ldr w9,[x8]
00af7a64	ldr w8,[x8, #0x10]
00af7a68	lsl w9,w9,#0x3
00af7a6c	and w8,w8,#0x7
00af7a70	sub w2,w9,w8
00af7a74	bl 0x00c32250
00af7a78	b 0x00af7ad4
00af7a7c	ldr x8,[x19, #0x8]
00af7a80	mov x0,x20
00af7a84	mov w1,w26
00af7a88	mov w2,wzr
00af7a8c	ldr x3,[x8]
00af7a90	bl 0x00af86d8
00af7a94	cbz w0,0x00af7b04
00af7a98	adrp x1,0x2cc000
00af7a9c	mov x0,x20
00af7aa0	add x1,x1,#0xc8b
00af7aa4	bl 0x00c32260
00af7aa8	ldr x8,[x19, #0x8]
00af7aac	orr w2,wzr,#0xff
00af7ab0	mov x0,x20
00af7ab4	mov w1,w26
00af7ab8	ldr x3,[x8, #0x8]
00af7abc	bl 0x00af86d8
00af7ac0	cbz w0,0x00af7b04
00af7ac4	adrp x1,0x2c4000
00af7ac8	mov x0,x20
00af7acc	add x1,x1,#0xdae
00af7ad0	bl 0x00c32260
00af7ad4	mov x0,x27
00af7ad8	add w24,w24,#0x1
00af7adc	bl 0x00c325e0
00af7ae0	cmp w24,w0
00af7ae4	b.lt 0x00af7a04
00af7ae8	mov x0,x21
00af7aec	add w22,w22,#0x1
00af7af0	bl 0x00c325e0
00af7af4	ldr w19,[sp, #0xc]
00af7af8	cmp w22,w0
00af7afc	b.lt 0x00af785c
00af7b00	mov w0,#0x1
00af7b04	ldp x29,x30,[sp, #0x60]
00af7b08	ldp x20,x19,[sp, #0x50]
00af7b0c	ldp x22,x21,[sp, #0x40]
00af7b10	ldp x24,x23,[sp, #0x30]
00af7b14	ldp x26,x25,[sp, #0x20]
00af7b18	ldp x28,x27,[sp, #0x10]
00af7b1c	add sp,sp,#0x70
00af7b20	ret
