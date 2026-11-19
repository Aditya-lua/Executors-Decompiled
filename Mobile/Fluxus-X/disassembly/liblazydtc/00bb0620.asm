; ZSTD_decompressionMargin @ 00bb0620
00bb0620	sub sp,sp,#0xa0
00bb0624	stp x29,x30,[sp, #0x50]
00bb0628	str x25,[sp, #0x60]
00bb062c	stp x24,x23,[sp, #0x70]
00bb0630	stp x22,x21,[sp, #0x80]
00bb0634	stp x20,x19,[sp, #0x90]
00bb0638	add x29,sp,#0x50
00bb063c	mrs x21,tpidr_el0
00bb0640	ldr x8,[x21, #0x28]
00bb0644	stur x8,[x29, #-0x8]
00bb0648	cbz x1,0x00bb06f4
00bb064c	mov x19,x1
00bb0650	mov x20,x0
00bb0654	mov w22,wzr
00bb0658	mov x23,xzr
00bb065c	b 0x00bb0670
00bb0660	add x23,x24,x23
00bb0664	subs x19,x19,x24
00bb0668	add x20,x20,x24
00bb066c	b.eq 0x00bb06fc
00bb0670	sub x8,x29,#0x20
00bb0674	mov x0,x20
00bb0678	mov x1,x19
00bb067c	mov w2,wzr
00bb0680	bl 0x00bb04a4
00bb0684	ldp x24,x25,[x29, #-0x18]
00bb0688	mov x0,sp
00bb068c	mov x1,x20
00bb0690	mov x2,x19
00bb0694	mov w3,wzr
00bb0698	bl 0x00c435f0
00bb069c	cmn x0,#0x78
00bb06a0	b.hi 0x00bb0700
00bb06a4	cmn x24,#0x78
00bb06a8	mov x0,#-0x14
00bb06ac	b.hi 0x00bb0700
00bb06b0	cmn x25,#0x2
00bb06b4	b.eq 0x00bb0700
00bb06b8	ldr w8,[sp, #0x14]
00bb06bc	cbnz w8,0x00bb0660
00bb06c0	ldr w8,[sp, #0x20]
00bb06c4	ldr w9,[sp, #0x18]
00bb06c8	ldr w10,[sp, #0x10]
00bb06cc	cmp w8,#0x0
00bb06d0	ldur x8,[x29, #-0x20]
00bb06d4	add x9,x23,x9
00bb06d8	cset w11,ne
00bb06dc	cmp w22,w10
00bb06e0	add x9,x9,w11, UXTW  #0x2
00bb06e4	add x8,x8,x8, LSL #0x1
00bb06e8	csel w22,w22,w10,hi
00bb06ec	add x23,x9,x8
00bb06f0	b 0x00bb0664
00bb06f4	mov x0,xzr
00bb06f8	b 0x00bb0700
00bb06fc	add x0,x23,w22, UXTW 
00bb0700	ldr x8,[x21, #0x28]
00bb0704	ldur x9,[x29, #-0x8]
00bb0708	cmp x8,x9
00bb070c	b.ne 0x00bb072c
00bb0710	ldp x20,x19,[sp, #0x90]
00bb0714	ldr x25,[sp, #0x60]
00bb0718	ldp x22,x21,[sp, #0x80]
00bb071c	ldp x24,x23,[sp, #0x70]
00bb0720	ldp x29,x30,[sp, #0x50]
00bb0724	add sp,sp,#0xa0
00bb0728	ret
00bb072c	bl 0x00c2fec0
