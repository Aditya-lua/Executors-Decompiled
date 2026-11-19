; cpr::util::progressUserFunction<cpr::ProgressCallback> @ 008ed5c8
008ed5c8	sub sp,sp,#0x50
008ed5cc	str x19,[sp, #0x30]
008ed5d0	stp x29,x30,[sp, #0x40]
008ed5d4	add x29,sp,#0x40
008ed5d8	mrs x19,tpidr_el0
008ed5dc	ldr x8,[x19, #0x28]
008ed5e0	stur x8,[x29, #-0x18]
008ed5e4	ldr x8,[x0]
008ed5e8	stp x2,x1,[sp, #0x18]
008ed5ec	stp x4,x3,[sp, #0x8]
008ed5f0	str x8,[sp]
008ed5f4	ldr x0,[x0, #0x30]
008ed5f8	cbz x0,0x008ed644
008ed5fc	ldr x8,[x0]
008ed600	add x1,sp,#0x20
008ed604	add x2,sp,#0x18
008ed608	add x3,sp,#0x10
008ed60c	ldr x8,[x8, #0x30]
008ed610	add x4,sp,#0x8
008ed614	mov x5,sp
008ed618	blr x8
008ed61c	ldr x8,[x19, #0x28]
008ed620	ldur x9,[x29, #-0x18]
008ed624	cmp x8,x9
008ed628	b.ne 0x008ed670
008ed62c	ldp x29,x30,[sp, #0x40]
008ed630	ldr x19,[sp, #0x30]
008ed634	mvn w8,w0
008ed638	and w0,w8,#0x1
008ed63c	add sp,sp,#0x50
008ed640	ret
008ed644	mov w0,#0x8
008ed648	bl 0x00c30000
008ed64c	adrp x8,0xcb4000
008ed650	ldr x8,[x8, #0xb50]
008ed654	adrp x1,0xcb4000
008ed658	adrp x2,0xcb4000
008ed65c	add x8,x8,#0x10
008ed660	str x8,[x0]
008ed664	ldr x1,[x1, #0xb58]
008ed668	ldr x2,[x2, #0xb38]
008ed66c	bl 0x00c30020
008ed670	bl 0x00c2fec0
