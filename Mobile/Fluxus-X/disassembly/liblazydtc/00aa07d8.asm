; BN_hex2bn @ 00aa07d8
00aa07d8	sub sp,sp,#0x70
00aa07dc	stp x28,x27,[sp, #0x10]
00aa07e0	stp x26,x25,[sp, #0x20]
00aa07e4	stp x24,x23,[sp, #0x30]
00aa07e8	stp x22,x21,[sp, #0x40]
00aa07ec	stp x20,x19,[sp, #0x50]
00aa07f0	stp x29,x30,[sp, #0x60]
00aa07f4	add x29,sp,#0x60
00aa07f8	cbz x1,0x00aa084c
00aa07fc	ldrb w8,[x1]
00aa0800	mov x22,x1
00aa0804	cbz w8,0x00aa084c
00aa0808	mov x19,x0
00aa080c	cmp w8,#0x2d
00aa0810	b.ne 0x00aa0820
00aa0814	add x22,x22,#0x1
00aa0818	mov w23,#0x1
00aa081c	b 0x00aa0824
00aa0820	mov w23,wzr
00aa0824	mov x24,xzr
00aa0828	orr w25,wzr,#0x3f
00aa082c	ldrb w0,[x22, x24]
00aa0830	mov w1,#0x10
00aa0834	bl 0x00c377c0
00aa0838	cbz w0,0x00aa0874
00aa083c	add x24,x24,#0x1
00aa0840	lsr x8,x24,#0x1d
00aa0844	add w25,w25,#0x4
00aa0848	cbz x8,0x00aa082c
00aa084c	mov w20,wzr
00aa0850	mov w0,w20
00aa0854	ldp x29,x30,[sp, #0x60]
00aa0858	ldp x20,x19,[sp, #0x50]
00aa085c	ldp x22,x21,[sp, #0x40]
00aa0860	ldp x24,x23,[sp, #0x30]
00aa0864	ldp x26,x25,[sp, #0x20]
00aa0868	ldp x28,x27,[sp, #0x10]
00aa086c	add sp,sp,#0x70
00aa0870	ret
00aa0874	sub x26,x24,#0x1
00aa0878	orr w8,wzr,#0x1ffffffe
00aa087c	cmp w26,w8
00aa0880	mov w20,wzr
00aa0884	b.hi 0x00aa0850
00aa0888	add x20,x23,x24
00aa088c	cbz x19,0x00aa0850
00aa0890	ldr x21,[x19]
00aa0894	cbz x21,0x00aa08dc
00aa0898	mov w1,#0x2
00aa089c	mov x0,x21
00aa08a0	bl 0x00c38ce0
00aa08a4	cbz w0,0x00aa08ec
00aa08a8	bl 0x00c342a0
00aa08ac	adrp x0,0x2a6000
00aa08b0	adrp x2,0x2c9000
00aa08b4	add x0,x0,#0x3aa
00aa08b8	add x2,x2,#0xdaa
00aa08bc	mov w1,#0x9e
00aa08c0	bl 0x00c342b0
00aa08c4	mov w1,#0x106
00aa08c8	orr w0,wzr,#0x3
00aa08cc	movk w1,#0x8, LSL #16
00aa08d0	mov x2,xzr
00aa08d4	bl 0x00c342c0
00aa08d8	b 0x00aa084c
00aa08dc	bl 0x00c37710
00aa08e0	mov x21,x0
00aa08e4	cbnz x0,0x00aa08f4
00aa08e8	b 0x00aa084c
00aa08ec	mov x0,x21
00aa08f0	bl 0x00c38e00
00aa08f4	orr w8,wzr,#0x1ffffff0
00aa08f8	cmp w24,w8
00aa08fc	b.ls 0x00aa0918
00aa0900	ldr x8,[x19]
00aa0904	mov w20,wzr
00aa0908	cbnz x8,0x00aa0850
00aa090c	mov x0,x21
00aa0910	bl 0x00c36290
00aa0914	b 0x00aa084c
00aa0918	ldr w8,[x21, #0xc]
00aa091c	lsr w1,w25,#0x6
00aa0920	cmp w1,w8
00aa0924	b.le 0x00aa0934
00aa0928	mov x0,x21
00aa092c	bl 0x00c38e60
00aa0930	cbz x0,0x00aa0900
00aa0934	add x8,x22,x24
00aa0938	ubfx x9,x26,#0x4,#0x1c
00aa093c	mov x27,xzr
00aa0940	mvn w24,w24
00aa0944	add x25,x8,#0x1
00aa0948	add w26,w9,#0x1
00aa094c	stp x23,x9,[sp]
00aa0950	cmn w24,#0x11
00aa0954	orr w8,wzr,#0xffffffef
00aa0958	csel w8,w24,w8,gt
00aa095c	neg w8,w8
00aa0960	sxtw x23,w8
00aa0964	mov x22,xzr
00aa0968	sub x28,x25,x23
00aa096c	ldrb w0,[x28], #0x1
00aa0970	sub x23,x23,#0x1
00aa0974	bl 0x00c3e840
00aa0978	bic w8,w0,w0, ASR #0x1f
00aa097c	cmp x23,#0x1
00aa0980	orr x22,x8,x22, LSL #0x4
00aa0984	b.gt 0x00aa096c
00aa0988	ldr x8,[x21]
00aa098c	add w24,w24,#0x10
00aa0990	sub x25,x25,#0x10
00aa0994	str x22,[x8, x27, LSL #0x3]
00aa0998	add x27,x27,#0x1
00aa099c	cmp x27,x26
00aa09a0	b.ne 0x00aa0950
00aa09a4	ldr x8,[sp, #0x8]
00aa09a8	mov x0,x21
00aa09ac	add w8,w8,#0x1
00aa09b0	str w8,[x21, #0x8]
00aa09b4	bl 0x00c38e40
00aa09b8	str x21,[x19]
00aa09bc	ldr w8,[x21, #0x8]
00aa09c0	cbz w8,0x00aa0850
00aa09c4	ldr x8,[sp]
00aa09c8	str w8,[x21, #0x10]
00aa09cc	b 0x00aa0850
