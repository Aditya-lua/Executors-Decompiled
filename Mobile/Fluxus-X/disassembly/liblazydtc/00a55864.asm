; ERR_vset_error @ 00a55864
00a55864	sub sp,sp,#0x70
00a55868	stp x26,x25,[sp, #0x20]
00a5586c	stp x24,x23,[sp, #0x30]
00a55870	stp x22,x21,[sp, #0x40]
00a55874	stp x20,x19,[sp, #0x50]
00a55878	stp x29,x30,[sp, #0x60]
00a5587c	add x29,sp,#0x60
00a55880	mov x25,x3
00a55884	mov x20,x2
00a55888	mov w23,w1
00a5588c	mov w24,w0
00a55890	bl 0x00c3be80
00a55894	cbz x0,0x00a55a10
00a55898	ldrsw x8,[x0, #0x380]
00a5589c	mov x19,x0
00a558a0	cbz x20,0x00a55920
00a558a4	add x9,x19,x8, LSL #0x3
00a558a8	ldr x21,[x9, #0x180]
00a558ac	ldr x22,[x9, #0x100]
00a558b0	add x8,x19,x8, LSL #0x2
00a558b4	str xzr,[x9, #0x100]
00a558b8	cmp x21,#0x3ff
00a558bc	str wzr,[x8, #0x200]
00a558c0	b.hi 0x00a558ec
00a558c4	adrp x2,0x2ad000
00a558c8	add x2,x2,#0xc21
00a558cc	mov w1,#0x400
00a558d0	mov w3,#0x54
00a558d4	mov x0,x22
00a558d8	mov w26,#0x400
00a558dc	bl 0x00c356f0
00a558e0	cmp x0,#0x0
00a558e4	csel x21,x21,x26,eq
00a558e8	csel x22,x22,x0,eq
00a558ec	cbz x22,0x00a55930
00a558f0	ldr q0,[x25, #0x10]
00a558f4	mov x3,sp
00a558f8	mov x0,x22
00a558fc	mov x1,x21
00a55900	str q0,[sp, #0x10]
00a55904	ldr q0,[x25]
00a55908	mov x2,x20
00a5590c	str q0,[sp]
00a55910	bl 0x00c38720
00a55914	bic w26,w0,w0, ASR #0x1f
00a55918	strb wzr,[x22, w26, UXTW ]
00a5591c	b 0x00a55934
00a55920	mov x21,xzr
00a55924	mov w25,wzr
00a55928	mov x22,xzr
00a5592c	b 0x00a55970
00a55930	mov w26,wzr
00a55934	add w25,w26,#0x1
00a55938	adrp x2,0x2ad000
00a5593c	add x2,x2,#0xc21
00a55940	mov w3,#0x67
00a55944	mov x0,x22
00a55948	mov x1,x25
00a5594c	bl 0x00c356f0
00a55950	cbz x0,0x00a55960
00a55954	mov x21,x25
00a55958	mov x22,x0
00a5595c	strb wzr,[x0, w26, UXTW ]
00a55960	ldrsw x8,[x19, #0x380]
00a55964	cmp x22,#0x0
00a55968	orr w9,wzr,#0x3
00a5596c	csel w25,wzr,w9,eq
00a55970	add x9,x19,x8, LSL #0x2
00a55974	ldrb w12,[x9, #0x200]
00a55978	add x10,x19,x8, LSL #0x3
00a5597c	add x11,x10,#0x100
00a55980	tbnz w12,#0x0,0x00a55994
00a55984	mov w8,wzr
00a55988	str xzr,[x11]
00a5598c	str xzr,[x10, #0x180]
00a55990	b 0x00a559a4
00a55994	ldr x8,[x11]
00a55998	cbz x8,0x00a559ac
00a5599c	strb wzr,[x8]
00a559a0	mov w8,#0x1
00a559a4	add x9,x9,#0x200
00a559a8	str w8,[x9]
00a559ac	ldrsw x26,[x19, #0x380]
00a559b0	cmp w24,#0x2
00a559b4	b.ne 0x00a559c0
00a559b8	orr w8,w23,#0x80000000
00a559bc	b 0x00a559c8
00a559c0	and w8,w23,#0x7fffff
00a559c4	bfm w8,w24,#0x9,#0x7
00a559c8	mov w9,w8
00a559cc	add x8,x19,x26, LSL #0x3
00a559d0	str x9,[x8, #0x80]
00a559d4	cbz x20,0x00a55a10
00a559d8	add x9,x19,x26, LSL #0x2
00a559dc	ldrb w10,[x9, #0x200]
00a559e0	add x20,x9,#0x200
00a559e4	add x23,x8,#0x100
00a559e8	tbz w10,#0x0,0x00a55a00
00a559ec	ldr x0,[x23]
00a559f0	adrp x1,0x2d3000
00a559f4	add x1,x1,#0xaa2
00a559f8	mov w2,#0x49
00a559fc	bl 0x00c32310
00a55a00	add x8,x19,x26, LSL #0x3
00a55a04	str x22,[x23]
00a55a08	str x21,[x8, #0x180]
00a55a0c	str w25,[x20]
00a55a10	ldp x29,x30,[sp, #0x60]
00a55a14	ldp x20,x19,[sp, #0x50]
00a55a18	ldp x22,x21,[sp, #0x40]
00a55a1c	ldp x24,x23,[sp, #0x30]
00a55a20	ldp x26,x25,[sp, #0x20]
00a55a24	add sp,sp,#0x70
00a55a28	ret
