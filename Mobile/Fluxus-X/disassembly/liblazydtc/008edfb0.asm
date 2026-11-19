; std::__ndk1::operator+ @ 008edfb0
008edfb0	str x25,[sp, #-0x50]!
008edfb4	stp x24,x23,[sp, #0x10]
008edfb8	stp x22,x21,[sp, #0x20]
008edfbc	stp x20,x19,[sp, #0x30]
008edfc0	stp x29,x30,[sp, #0x40]
008edfc4	add x29,sp,#0x40
008edfc8	stp xzr,xzr,[x8]
008edfcc	str xzr,[x8, #0x10]
008edfd0	mov x19,x8
008edfd4	ldrb w8,[x0]
008edfd8	mov x23,x0
008edfdc	mov x20,x1
008edfe0	tbnz w8,#0x0,0x008edffc
008edfe4	mov x0,x20
008edfe8	lsr w21,w8,#0x1
008edfec	bl 0x00c2ff50
008edff0	mov x22,x0
008edff4	add x23,x23,#0x1
008edff8	b 0x008ee010
008edffc	ldr x21,[x23, #0x8]
008ee000	mov x0,x20
008ee004	bl 0x00c2ff50
008ee008	ldr x23,[x23, #0x10]
008ee00c	mov x22,x0
008ee010	add x8,x21,x22
008ee014	cmn x8,#0x10
008ee018	b.cs 0x008ee098
008ee01c	cmp x8,#0x16
008ee020	b.hi 0x008ee070
008ee024	lsl w8,w21,#0x1
008ee028	mov x24,x19
008ee02c	strb w8,[x24], #0x1
008ee030	cbz x21,0x008ee044
008ee034	mov x0,x24
008ee038	mov x1,x23
008ee03c	mov x2,x21
008ee040	bl 0x00c2ffd0
008ee044	strb wzr,[x24, x21]
008ee048	mov x0,x19
008ee04c	mov x1,x20
008ee050	mov x2,x22
008ee054	bl 0x00c308c0
008ee058	ldp x29,x30,[sp, #0x40]
008ee05c	ldp x20,x19,[sp, #0x30]
008ee060	ldp x22,x21,[sp, #0x20]
008ee064	ldp x24,x23,[sp, #0x10]
008ee068	ldr x25,[sp], #0x50
008ee06c	ret
008ee070	add x8,x8,#0x10
008ee074	and x25,x8,#-0x10
008ee078	mov x0,x25
008ee07c	bl 0x00c2fed0
008ee080	mov x24,x0
008ee084	orr x8,x25,#0x1
008ee088	stp x21,x0,[x19, #0x8]
008ee08c	str x8,[x19]
008ee090	cbnz x21,0x008ee034
008ee094	b 0x008ee044
008ee098	mov x0,x19
008ee09c	bl 0x00c30ce0
