; asn1_d2i_read_bio @ 00abd860
00abd860	sub sp,sp,#0x80
00abd864	stp x28,x27,[sp, #0x20]
00abd868	stp x26,x25,[sp, #0x30]
00abd86c	stp x24,x23,[sp, #0x40]
00abd870	stp x22,x21,[sp, #0x50]
00abd874	stp x20,x19,[sp, #0x60]
00abd878	stp x29,x30,[sp, #0x70]
00abd87c	add x29,sp,#0x70
00abd880	mov x21,x1
00abd884	mov x22,x0
00abd888	bl 0x00c37020
00abd88c	cbz x0,0x00abd8ac
00abd890	mov x19,x0
00abd894	bl 0x00c35250
00abd898	mov w25,wzr
00abd89c	mov x20,xzr
00abd8a0	mov x26,xzr
00abd8a4	mov w27,#0x8
00abd8a8	b 0x00abd8e4
00abd8ac	bl 0x00c342a0
00abd8b0	adrp x0,0x2d8000
00abd8b4	adrp x2,0x2a2000
00abd8b8	add x0,x0,#0x61b
00abd8bc	add x2,x2,#0xba7
00abd8c0	orr w1,wzr,#0x7e
00abd8c4	bl 0x00c342b0
00abd8c8	mov w1,#0x100
00abd8cc	mov w0,#0xd
00abd8d0	movk w1,#0xc, LSL #16
00abd8d4	mov x2,xzr
00abd8d8	bl 0x00c342c0
00abd8dc	b 0x00abdad0
00abd8e0	add w25,w25,#0x1
00abd8e4	sub x23,x26,x20
00abd8e8	cmp x23,#0x9
00abd8ec	b.cs 0x00abd94c
00abd8f0	sub x24,x27,x23
00abd8f4	adds x1,x24,x26
00abd8f8	b.cs 0x00abdaf8
00abd8fc	mov x0,x19
00abd900	bl 0x00c37010
00abd904	cbz x0,0x00abdaf8
00abd908	ldr x8,[x19, #0x8]
00abd90c	mov x0,x22
00abd910	mov w2,w24
00abd914	add x1,x8,x26
00abd918	bl 0x00c34220
00abd91c	cbnz x23,0x00abd924
00abd920	tbnz w0,#0x1f,0x00abdb5c
00abd924	cmp w0,#0x1
00abd928	b.lt 0x00abd938
00abd92c	adds x26,x26,w0, SXTW 
00abd930	b.cs 0x00abdb9c
00abd934	sub x23,x26,x20
00abd938	ldr x8,[x19, #0x8]
00abd93c	add x24,x8,x20
00abd940	str x24,[sp, #0x18]
00abd944	cbnz x23,0x00abd958
00abd948	b 0x00abdac4
00abd94c	ldr x8,[x19, #0x8]
00abd950	add x24,x8,x20
00abd954	str x24,[sp, #0x18]
00abd958	add x0,sp,#0x18
00abd95c	add x1,sp,#0x10
00abd960	add x2,sp,#0xc
00abd964	add x3,sp,#0x8
00abd968	mov x4,x23
00abd96c	bl 0x00c376a0
00abd970	mov w23,w0
00abd974	tbz w0,#0x7,0x00abd998
00abd978	bl 0x00c32420
00abd97c	asr w8,w0,#0x1f
00abd980	and w8,w8,#0x7f800000
00abd984	orr w8,w8,#0x7fffff
00abd988	and w8,w8,w0
00abd98c	cmp w8,#0x9b
00abd990	b.ne 0x00abdac4
00abd994	bl 0x00c35240
00abd998	ldr w8,[sp, #0x18]
00abd99c	sub w8,w8,w24
00abd9a0	add x20,x20,w8, SXTW 
00abd9a4	tbnz w23,#0x0,0x00abda60
00abd9a8	ldr x8,[sp, #0x10]
00abd9ac	cbz w25,0x00abd9bc
00abd9b0	cbnz x8,0x00abd9bc
00abd9b4	ldr w9,[sp, #0xc]
00abd9b8	cbz w9,0x00abda6c
00abd9bc	sub x9,x26,x20
00abd9c0	subs x24,x8,x9
00abd9c4	b.ls 0x00abda50
00abd9c8	cmn x24,x26
00abd9cc	lsr x10,x24,#0x1f
00abd9d0	cset w9,cs
00abd9d4	cbnz x10,0x00abdb78
00abd9d8	tbnz w9,#0x0,0x00abdb78
00abd9dc	cbz x24,0x00abda50
00abd9e0	mov w28,#0x4000
00abd9e4	cmp x24,x28
00abd9e8	csel x27,x28,x24,hi
00abd9ec	add x1,x27,x26
00abd9f0	mov x0,x19
00abd9f4	bl 0x00c37010
00abd9f8	cbz x0,0x00abdb14
00abd9fc	cbz x27,0x00abda30
00abda00	mov x23,x27
00abda04	ldr x8,[x19, #0x8]
00abda08	mov x0,x22
00abda0c	mov w2,w23
00abda10	add x1,x8,x26
00abda14	bl 0x00c34220
00abda18	cmp w0,#0x0
00abda1c	b.le 0x00abda98
00abda20	sxtw x8,w0
00abda24	subs x23,x23,x8
00abda28	add x26,x26,x8
00abda2c	b.ne 0x00abda04
00abda30	orr w8,wzr,#0x3fffffff
00abda34	cmp x28,x8
00abda38	cset w8,cc
00abda3c	sub x24,x24,x27
00abda40	lsl x28,x28,x8
00abda44	cbnz x24,0x00abd9e4
00abda48	ldr x8,[sp, #0x10]
00abda4c	mov w27,#0x8
00abda50	adds x20,x8,x20
00abda54	b.cs 0x00abdb40
00abda58	cbnz w25,0x00abd8e4
00abda5c	b 0x00abda74
00abda60	cmn w25,#0x1
00abda64	b.ne 0x00abd8e0
00abda68	b 0x00abdbc4
00abda6c	subs w25,w25,#0x1
00abda70	b.ne 0x00abd8e4
00abda74	lsr x8,x20,#0x1f
00abda78	cbz x8,0x00abdb94
00abda7c	bl 0x00c342a0
00abda80	adrp x0,0x2d8000
00abda84	adrp x2,0x2a2000
00abda88	add x0,x0,#0x61b
00abda8c	add x2,x2,#0xba7
00abda90	mov w1,#0xf3
00abda94	b 0x00abdbb4
00abda98	bl 0x00c342a0
00abda9c	adrp x0,0x2d8000
00abdaa0	adrp x2,0x2a2000
00abdaa4	add x0,x0,#0x61b
00abdaa8	add x2,x2,#0xba7
00abdaac	mov w1,#0xd8
00abdab0	bl 0x00c342b0
00abdab4	mov w0,#0xd
00abdab8	mov w1,#0x8e
00abdabc	mov x2,xzr
00abdac0	bl 0x00c342c0
00abdac4	bl 0x00c35ed0
00abdac8	mov x0,x19
00abdacc	bl 0x00c35660
00abdad0	mov w20,#0xffffffff
00abdad4	mov w0,w20
00abdad8	ldp x29,x30,[sp, #0x70]
00abdadc	ldp x20,x19,[sp, #0x60]
00abdae0	ldp x22,x21,[sp, #0x50]
00abdae4	ldp x24,x23,[sp, #0x40]
00abdae8	ldp x26,x25,[sp, #0x30]
00abdaec	ldp x28,x27,[sp, #0x20]
00abdaf0	add sp,sp,#0x80
00abdaf4	ret
00abdaf8	bl 0x00c342a0
00abdafc	adrp x0,0x2d8000
00abdb00	adrp x2,0x2a2000
00abdb04	add x0,x0,#0x61b
00abdb08	add x2,x2,#0xba7
00abdb0c	mov w1,#0x89
00abdb10	b 0x00abdb2c
00abdb14	bl 0x00c342a0
00abdb18	adrp x0,0x2d8000
00abdb1c	adrp x2,0x2a2000
00abdb20	add x0,x0,#0x61b
00abdb24	add x2,x2,#0xba7
00abdb28	mov w1,#0xd1
00abdb2c	bl 0x00c342b0
00abdb30	mov w1,#0x100
00abdb34	mov w0,#0xd
00abdb38	movk w1,#0xc, LSL #16
00abdb3c	b 0x00abdabc
00abdb40	bl 0x00c342a0
00abdb44	adrp x0,0x2d8000
00abdb48	adrp x2,0x2a2000
00abdb4c	add x0,x0,#0x61b
00abdb50	add x2,x2,#0xba7
00abdb54	mov w1,#0xe7
00abdb58	b 0x00abdbb4
00abdb5c	bl 0x00c342a0
00abdb60	adrp x0,0x2d8000
00abdb64	adrp x2,0x2a2000
00abdb68	add x0,x0,#0x61b
00abdb6c	add x2,x2,#0xba7
00abdb70	mov w1,#0x8e
00abdb74	b 0x00abdab0
00abdb78	bl 0x00c342a0
00abdb7c	adrp x0,0x2d8000
00abdb80	adrp x2,0x2a2000
00abdb84	add x0,x0,#0x61b
00abdb88	add x2,x2,#0xba7
00abdb8c	mov w1,#0xc4
00abdb90	b 0x00abdbb4
00abdb94	str x19,[x21]
00abdb98	b 0x00abdad4
00abdb9c	bl 0x00c342a0
00abdba0	adrp x0,0x2d8000
00abdba4	adrp x2,0x2a2000
00abdba8	add x0,x0,#0x61b
00abdbac	add x2,x2,#0xba7
00abdbb0	mov w1,#0x93
00abdbb4	bl 0x00c342b0
00abdbb8	mov w0,#0xd
00abdbbc	mov w1,#0x9b
00abdbc0	b 0x00abdabc
00abdbc4	bl 0x00c342a0
00abdbc8	adrp x0,0x2d8000
00abdbcc	adrp x2,0x2a2000
00abdbd0	add x0,x0,#0x61b
00abdbd4	add x2,x2,#0xba7
00abdbd8	mov w1,#0xaf
00abdbdc	bl 0x00c342b0
00abdbe0	mov w0,#0xd
00abdbe4	mov w1,#0x7b
00abdbe8	b 0x00abdabc
