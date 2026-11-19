; FUN_00ad6784 @ 00ad6784
00ad6784	sub sp,sp,#0x60
00ad6788	stp x26,x25,[sp, #0x10]
00ad678c	stp x24,x23,[sp, #0x20]
00ad6790	stp x22,x21,[sp, #0x30]
00ad6794	stp x20,x19,[sp, #0x40]
00ad6798	stp x29,x30,[sp, #0x50]
00ad679c	mov x25,x0
00ad67a0	ldr x24,[x0, #0x98]
00ad67a4	ldr x0,[x0, #0x88]
00ad67a8	add x29,sp,#0x50
00ad67ac	mov x22,x4
00ad67b0	mov x23,x3
00ad67b4	mov x19,x2
00ad67b8	mov x20,x1
00ad67bc	bl 0x00c3d8d0
00ad67c0	ldr x8,[x24, #0x20]
00ad67c4	mov x21,x0
00ad67c8	cbz x8,0x00ad682c
00ad67cc	mov x0,x8
00ad67d0	bl 0x00c34c20
00ad67d4	sxtw x8,w0
00ad67d8	cmp x8,x22
00ad67dc	b.ne 0x00ad6858
00ad67e0	ldr x0,[x24, #0x20]
00ad67e4	bl 0x00c34c30
00ad67e8	cmp w0,#0x5f
00ad67ec	b.ne 0x00ad68a4
00ad67f0	ldr w8,[x24, #0x1c]
00ad67f4	cmp w8,#0x1
00ad67f8	b.ne 0x00ad6884
00ad67fc	add x4,sp,#0xc
00ad6800	mov w0,wzr
00ad6804	mov x1,x23
00ad6808	mov w2,w22
00ad680c	mov x3,x20
00ad6810	mov x5,x21
00ad6814	bl 0x00c40000
00ad6818	cmp w0,#0x1
00ad681c	b.lt 0x00ad6888
00ad6820	ldr w0,[sp, #0xc]
00ad6824	tbz w0,#0x1f,0x00ad6848
00ad6828	b 0x00ad6888
00ad682c	ldr w4,[x24, #0x1c]
00ad6830	mov w0,w22
00ad6834	mov x1,x23
00ad6838	mov x2,x20
00ad683c	mov x3,x21
00ad6840	bl 0x00c3fde0
00ad6844	tbnz w0,#0x1f,0x00ad6888
00ad6848	sxtw x8,w0
00ad684c	mov w0,#0x1
00ad6850	str x8,[x19]
00ad6854	b 0x00ad6888
00ad6858	bl 0x00c342a0
00ad685c	adrp x0,0x2ae000
00ad6860	adrp x2,0x2c8000
00ad6864	add x0,x0,#0x623
00ad6868	add x2,x2,#0x257
00ad686c	mov w1,#0x94
00ad6870	bl 0x00c342b0
00ad6874	mov w0,#0x4
00ad6878	mov w1,#0x8f
00ad687c	mov x2,xzr
00ad6880	bl 0x00c342c0
00ad6884	mov w0,#0xffffffff
00ad6888	ldp x29,x30,[sp, #0x50]
00ad688c	ldp x20,x19,[sp, #0x40]
00ad6890	ldp x22,x21,[sp, #0x30]
00ad6894	ldp x24,x23,[sp, #0x20]
00ad6898	ldp x26,x25,[sp, #0x10]
00ad689c	add sp,sp,#0x60
00ad68a0	ret
00ad68a4	ldr w8,[x24, #0x1c]
00ad68a8	cmp w8,#0x1
00ad68ac	b.eq 0x00ad68fc
00ad68b0	cmp w8,#0x6
00ad68b4	b.eq 0x00ad6930
00ad68b8	cmp w8,#0x5
00ad68bc	b.ne 0x00ad6884
00ad68c0	mov x0,x21
00ad68c4	bl 0x00c3fab0
00ad68c8	add x26,x22,#0x1
00ad68cc	cmp x26,w0, SXTW 
00ad68d0	b.ls 0x00ad6970
00ad68d4	bl 0x00c342a0
00ad68d8	adrp x0,0x2ae000
00ad68dc	adrp x2,0x2c8000
00ad68e0	add x0,x0,#0x623
00ad68e4	add x2,x2,#0x257
00ad68e8	mov w1,#0xa3
00ad68ec	bl 0x00c342b0
00ad68f0	mov w0,#0x4
00ad68f4	orr w1,wzr,#0x78
00ad68f8	b 0x00ad687c
00ad68fc	ldr x0,[x24, #0x20]
00ad6900	bl 0x00c34c30
00ad6904	add x4,sp,#0x8
00ad6908	mov x1,x23
00ad690c	mov w2,w22
00ad6910	mov x3,x20
00ad6914	mov x5,x21
00ad6918	bl 0x00c3fff0
00ad691c	cmp w0,#0x1
00ad6920	b.lt 0x00ad6888
00ad6924	ldr w0,[sp, #0x8]
00ad6928	tbz w0,#0x1f,0x00ad6848
00ad692c	b 0x00ad6888
00ad6930	mov x0,x24
00ad6934	mov x1,x25
00ad6938	bl 0x00ad789c
00ad693c	cbz w0,0x00ad6884
00ad6940	ldr x1,[x24, #0x38]
00ad6944	ldp x3,x4,[x24, #0x20]
00ad6948	ldr w5,[x24, #0x30]
00ad694c	mov x0,x21
00ad6950	mov x2,x23
00ad6954	bl 0x00c3ffe0
00ad6958	cbz w0,0x00ad6884
00ad695c	mov x0,x21
00ad6960	bl 0x00c3fab0
00ad6964	ldr x1,[x24, #0x38]
00ad6968	orr w4,wzr,#0x3
00ad696c	b 0x00ad6838
00ad6970	mov x0,x24
00ad6974	mov x1,x25
00ad6978	bl 0x00ad789c
00ad697c	cbz w0,0x00ad69b4
00ad6980	ldr x0,[x24, #0x38]
00ad6984	mov x1,x23
00ad6988	mov x2,x22
00ad698c	bl 0x00c2ffd0
00ad6990	ldr x0,[x24, #0x20]
00ad6994	bl 0x00c34c30
00ad6998	bl 0x00c3ffd0
00ad699c	ldr x8,[x24, #0x38]
00ad69a0	mov w4,#0x5
00ad69a4	strb w0,[x8, x22]
00ad69a8	ldr x1,[x24, #0x38]
00ad69ac	mov w0,w26
00ad69b0	b 0x00ad6838
00ad69b4	bl 0x00c342a0
00ad69b8	adrp x0,0x2ae000
00ad69bc	adrp x2,0x2c8000
00ad69c0	add x0,x0,#0x623
00ad69c4	add x2,x2,#0x257
00ad69c8	mov w1,#0xa7
00ad69cc	bl 0x00c342b0
00ad69d0	mov w1,#0x100
00ad69d4	mov w0,#0x4
00ad69d8	movk w1,#0xc, LSL #16
00ad69dc	b 0x00ad687c
