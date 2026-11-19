; ZSTD_decompressBlock_internal @ 00bbaeac
00bbaeac	sub sp,sp,#0x70
00bbaeb0	stp x29,x30,[sp, #0x10]
00bbaeb4	stp x28,x27,[sp, #0x20]
00bbaeb8	stp x26,x25,[sp, #0x30]
00bbaebc	stp x24,x23,[sp, #0x40]
00bbaec0	stp x22,x21,[sp, #0x50]
00bbaec4	stp x20,x19,[sp, #0x60]
00bbaec8	add x29,sp,#0x10
00bbaecc	mrs x25,tpidr_el0
00bbaed0	add x26,x0,#0x7, LSL #12
00bbaed4	mov x23,x4
00bbaed8	ldr x8,[x25, #0x28]
00bbaedc	mov x22,x3
00bbaee0	mov x20,x0
00bbaee4	mov x19,x2
00bbaee8	mov x21,x1
00bbaeec	str x8,[sp, #0x8]
00bbaef0	ldr w8,[x26, #0x5e0]
00bbaef4	cbz w8,0x00bbaf0c
00bbaef8	ldr w8,[x26, #0x4f8]
00bbaefc	cmp x23,x8
00bbaf00	b.ls 0x00bbaf18
00bbaf04	mov x0,#-0x48
00bbaf08	b 0x00bbb058
00bbaf0c	mov w8,#0x20000
00bbaf10	cmp x23,x8
00bbaf14	b.hi 0x00bbaf04
00bbaf18	mov x0,x20
00bbaf1c	mov x1,x22
00bbaf20	mov x2,x23
00bbaf24	mov x3,x21
00bbaf28	mov x4,x19
00bbaf2c	bl 0x00bba2e4
00bbaf30	cmn x0,#0x78
00bbaf34	b.hi 0x00bbb058
00bbaf38	ldr w8,[x26, #0x5e0]
00bbaf3c	add x22,x22,x0
00bbaf40	sub x24,x23,x0
00bbaf44	cbz w8,0x00bbaf50
00bbaf48	ldr w8,[x26, #0x4f8]
00bbaf4c	b 0x00bbaf54
00bbaf50	mov w8,#0x20000
00bbaf54	cmp x19,x8
00bbaf58	ldr x28,[x20, #0x74d0]
00bbaf5c	ldr w27,[x26, #0x5fc]
00bbaf60	add x1,sp,#0x4
00bbaf64	mov x0,x20
00bbaf68	mov x2,x22
00bbaf6c	mov x3,x24
00bbaf70	csel x23,x19,x8,cc
00bbaf74	bl 0x00c43740
00bbaf78	cmn x0,#0x78
00bbaf7c	mov x8,x0
00bbaf80	b.hi 0x00bbb054
00bbaf84	cmp x21,#0x0
00bbaf88	ldr w5,[sp, #0x4]
00bbaf8c	mov x8,#-0x100001
00bbaf90	ccmp x19,#0x0,#0x4,ne
00bbaf94	ccmp w5,#0x0,#0x4,eq
00bbaf98	cset w9,gt
00bbaf9c	cmp x21,x8
00bbafa0	mov x8,#-0x46
00bbafa4	b.hi 0x00bbb054
00bbafa8	tbnz w9,#0x0,0x00bbb054
00bbafac	sub x24,x24,x0
00bbafb0	cbnz w27,0x00bbb000
00bbafb4	add x8,x21,x23
00bbafb8	mov w9,#0x1
00bbafbc	sub x8,x8,x28
00bbafc0	movk w9,#0x100, LSL #16
00bbafc4	cmp x8,x9
00bbafc8	b.cc 0x00bbb000
00bbafcc	cmp w5,#0x9
00bbafd0	b.lt 0x00bbb000
00bbafd4	ldr x8,[x20, #0x10]
00bbafd8	mov x23,x0
00bbafdc	mov w1,w5
00bbafe0	mov w27,w5
00bbafe4	mov x0,x8
00bbafe8	bl 0x00bbb08c
00bbafec	mov x8,x0
00bbaff0	mov w5,w27
00bbaff4	mov x0,x23
00bbaff8	cmp w8,#0x6
00bbaffc	cset w27,hi
00bbb000	str wzr,[x26, #0x5fc]
00bbb004	cbz w27,0x00bbb024
00bbb008	add x3,x22,x0
00bbb00c	mov x0,x20
00bbb010	mov x1,x21
00bbb014	mov x2,x19
00bbb018	mov x4,x24
00bbb01c	bl 0x00bbb0e8
00bbb020	b 0x00bbb050
00bbb024	ldr w8,[x26, #0x6a0]
00bbb028	add x3,x22,x0
00bbb02c	mov x0,x20
00bbb030	mov x1,x21
00bbb034	mov x2,x19
00bbb038	mov x4,x24
00bbb03c	cmp w8,#0x2
00bbb040	b.ne 0x00bbb04c
00bbb044	bl 0x00bbd630
00bbb048	b 0x00bbb050
00bbb04c	bl 0x00bbee80
00bbb050	mov x8,x0
00bbb054	mov x0,x8
00bbb058	ldr x8,[x25, #0x28]
00bbb05c	ldr x9,[sp, #0x8]
00bbb060	cmp x8,x9
00bbb064	b.ne 0x00bbb088
00bbb068	ldp x20,x19,[sp, #0x60]
00bbb06c	ldp x22,x21,[sp, #0x50]
00bbb070	ldp x24,x23,[sp, #0x40]
00bbb074	ldp x26,x25,[sp, #0x30]
00bbb078	ldp x28,x27,[sp, #0x20]
00bbb07c	ldp x29,x30,[sp, #0x10]
00bbb080	add sp,sp,#0x70
00bbb084	ret
00bbb088	bl 0x00c2fec0
