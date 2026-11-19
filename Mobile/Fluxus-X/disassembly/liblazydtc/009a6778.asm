; dtls1_clear_sent_buffer @ 009a6778
009a6778	str x21,[sp, #-0x30]!
009a677c	stp x20,x19,[sp, #0x10]
009a6780	stp x29,x30,[sp, #0x20]
009a6784	ldr x8,[x0, #0x4b8]
009a6788	mov x19,x0
009a678c	add x29,sp,#0x20
009a6790	ldr x0,[x8, #0x120]
009a6794	bl 0x00c34460
009a6798	cbz x0,0x009a67f8
009a679c	mov x20,x0
009a67a0	ldr x21,[x20, #0x8]
009a67a4	ldr w8,[x21, #0x28]
009a67a8	cbz w8,0x009a67d4
009a67ac	ldr x8,[x19, #0x878]
009a67b0	ldr x0,[x21, #0x30]
009a67b4	cmp x8,x0
009a67b8	b.eq 0x009a67c0
009a67bc	bl 0x00c342d0
009a67c0	ldr x8,[x19, #0x890]
009a67c4	ldr x0,[x21, #0x38]
009a67c8	cmp x8,x0
009a67cc	b.eq 0x009a67d4
009a67d0	bl 0x00c31f90
009a67d4	mov x0,x21
009a67d8	bl 0x00c343d0
009a67dc	mov x0,x20
009a67e0	bl 0x00c34430
009a67e4	ldr x8,[x19, #0x4b8]
009a67e8	ldr x0,[x8, #0x120]
009a67ec	bl 0x00c34460
009a67f0	mov x20,x0
009a67f4	cbnz x0,0x009a67a0
009a67f8	ldp x29,x30,[sp, #0x20]
009a67fc	ldp x20,x19,[sp, #0x10]
009a6800	ldr x21,[sp], #0x30
009a6804	ret
