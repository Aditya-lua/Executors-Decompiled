; std::__ndk1::__time_get::__time_get @ 00c044b0
00c044b0	paciasp
00c044b4	sub sp,sp,#0x50
00c044b8	stp x29,x30,[sp, #0x30]
00c044bc	stp x20,x19,[sp, #0x40]
00c044c0	add x29,sp,#0x30
00c044c4	mov x20,x0
00c044c8	mov w0,#0x1fbf
00c044cc	mov x2,xzr
00c044d0	mov x19,x1
00c044d4	bl 0x00c43890
00c044d8	str x0,[x20]
00c044dc	cbz x0,0x00c044f4
00c044e0	ldp x20,x19,[sp, #0x40]
00c044e4	ldp x29,x30,[sp, #0x30]
00c044e8	add sp,sp,#0x50
00c044ec	autiasp
00c044f0	ret
00c044f4	mov x0,sp
00c044f8	mov x1,x19
00c044fc	bl 0x00852d7c
00c04500	adrp x0,0x2c8000
00c04504	add x0,x0,#0x9bd
00c04508	add x8,sp,#0x18
00c0450c	mov x1,sp
00c04510	add x19,sp,#0x18
00c04514	bl 0x00bfb964
00c04518	ldrb w8,[sp, #0x18]
00c0451c	ldr x9,[sp, #0x28]
00c04520	tst w8,#0x1
00c04524	csinc x0,x9,x19,ne
00c04528	bl 0x00c43d00
00c0452c	ldrb w8,[sp, #0x18]
00c04530	mov x19,x0
00c04534	tbnz w8,#0x0,0x00c04548
00c04538	ldrb w8,[sp]
00c0453c	tbnz w8,#0x0,0x00c04570
00c04540	mov x0,x19
00c04544	bl 0x00c2c090
00c04548	ldr x8,[sp, #0x18]
00c0454c	ldr x0,[sp, #0x28]
00c04550	and x1,x8,#-0x2
00c04554	bl 0x00c2fe80
00c04558	ldrb w8,[sp]
00c0455c	tbz w8,#0x0,0x00c04540
00c04560	b 0x00c04570
00c04570	ldr x8,[sp]
00c04574	ldr x0,[sp, #0x10]
00c04578	and x1,x8,#-0x2
00c0457c	bl 0x00c2fe80
00c04580	mov x0,x19
00c04584	bl 0x00c2c090
