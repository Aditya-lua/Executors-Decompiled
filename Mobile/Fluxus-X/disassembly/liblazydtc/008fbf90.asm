; cpr::CurlContainer<cpr::Parameter>::Add @ 008fbf90
008fbf90	str x19,[sp, #-0x20]!
008fbf94	stp x29,x30,[sp, #0x10]
008fbf98	add x29,sp,#0x10
008fbf9c	mov x19,x0
008fbfa0	ldr x0,[x0, #0x10]
008fbfa4	ldr x8,[x19, #0x18]
008fbfa8	cmp x0,x8
008fbfac	b.eq 0x008fbfcc
008fbfb0	bl 0x00c30f30
008fbfb4	ldr x8,[x19, #0x10]
008fbfb8	add x8,x8,#0x30
008fbfbc	str x8,[x19, #0x10]
008fbfc0	ldp x29,x30,[sp, #0x10]
008fbfc4	ldr x19,[sp], #0x20
008fbfc8	ret
008fbfcc	ldp x29,x30,[sp, #0x10]
008fbfd0	add x0,x19,#0x8
008fbfd4	ldr x19,[sp], #0x20
008fbfd8	b 0x00c30f80
