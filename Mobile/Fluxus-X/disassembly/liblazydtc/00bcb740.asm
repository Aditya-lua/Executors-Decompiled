; std::__ndk1::system_error::system_error @ 00bcb740
00bcb740	paciasp
00bcb744	sub sp,sp,#0x70
00bcb748	stp x29,x30,[sp, #0x40]
00bcb74c	str x21,[sp, #0x50]
00bcb750	stp x20,x19,[sp, #0x60]
00bcb754	add x29,sp,#0x40
00bcb758	ldrb w8,[x3]
00bcb75c	mov x19,x2
00bcb760	mov w21,w1
00bcb764	mov x20,x0
00bcb768	str w1,[sp, #0x18]
00bcb76c	str x2,[sp, #0x20]
00bcb770	tbnz w8,#0x0,0x00bcb788
00bcb774	ldr q0,[x3]
00bcb778	ldr x8,[x3, #0x10]
00bcb77c	str q0,[sp]
00bcb780	str x8,[sp, #0x10]
00bcb784	b 0x00bcb794
00bcb788	ldp x2,x1,[x3, #0x8]
00bcb78c	mov x0,sp
00bcb790	bl 0x007ff40c
00bcb794	sub x8,x29,#0x18
00bcb798	add x0,sp,#0x18
00bcb79c	mov x1,sp
00bcb7a0	bl 0x00bcb424
00bcb7a4	sub x1,x29,#0x18
00bcb7a8	mov x0,x20
00bcb7ac	bl 0x00c43cf0
00bcb7b0	ldurb w8,[x29, #-0x18]
00bcb7b4	tbz w8,#0x0,0x00bcb7c8
00bcb7b8	ldur x8,[x29, #-0x18]
00bcb7bc	ldur x0,[x29, #-0x8]
00bcb7c0	and x1,x8,#-0x2
00bcb7c4	bl 0x00c2fe80
00bcb7c8	ldrb w8,[sp]
00bcb7cc	tbz w8,#0x0,0x00bcb7e0
00bcb7d0	ldr x8,[sp]
00bcb7d4	ldr x0,[sp, #0x10]
00bcb7d8	and x1,x8,#-0x2
00bcb7dc	bl 0x00c2fe80
00bcb7e0	adrp x8,0xcb5000
00bcb7e4	ldr x8,[x8, #0xb18]
00bcb7e8	str w21,[x20, #0x10]
00bcb7ec	add x8,x8,#0x10
00bcb7f0	str x8,[x20]
00bcb7f4	str x19,[x20, #0x18]
00bcb7f8	ldp x20,x19,[sp, #0x60]
00bcb7fc	ldr x21,[sp, #0x50]
00bcb800	ldp x29,x30,[sp, #0x40]
00bcb804	add sp,sp,#0x70
00bcb808	autiasp
00bcb80c	ret
