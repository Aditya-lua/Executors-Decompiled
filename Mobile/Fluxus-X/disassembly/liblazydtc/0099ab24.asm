; std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::insert<std::__ndk1::__wrap_iter<unsigned_char_const*>> @ 0099ab24
0099ab24	str x27,[sp, #-0x60]!
0099ab28	stp x26,x25,[sp, #0x10]
0099ab2c	stp x24,x23,[sp, #0x20]
0099ab30	stp x22,x21,[sp, #0x30]
0099ab34	stp x20,x19,[sp, #0x40]
0099ab38	stp x29,x30,[sp, #0x50]
0099ab3c	add x29,sp,#0x50
0099ab40	sub x27,x3,x2
0099ab44	mov x22,x3
0099ab48	mov x21,x2
0099ab4c	mov x19,x1
0099ab50	cmp x27,#0x1
0099ab54	mov x20,x0
0099ab58	b.lt 0x0099acd0
0099ab5c	ldp x9,x10,[x20, #0x8]
0099ab60	sub x8,x10,x9
0099ab64	cmp x27,x8
0099ab68	b.le 0x0099aba8
0099ab6c	ldr x25,[x20]
0099ab70	sub x8,x9,x25
0099ab74	adds x8,x8,x27
0099ab78	b.mi 0x0099ae04
0099ab7c	sub x9,x10,x25
0099ab80	orr x10,xzr,#0x3fffffffffffffff
0099ab84	cmp x9,x10
0099ab88	sub x23,x19,x25
0099ab8c	b.cs 0x0099acd8
0099ab90	lsl x9,x9,#0x1
0099ab94	cmp x9,x8
0099ab98	csel x24,x8,x9,cc
0099ab9c	cbnz x24,0x0099acdc
0099aba0	mov x26,xzr
0099aba4	b 0x0099ace8
0099aba8	sub x10,x9,x19
0099abac	cmp x27,x10
0099abb0	b.le 0x0099abf0
0099abb4	add x23,x21,x10
0099abb8	mov x8,x9
0099abbc	cmp x23,x22
0099abc0	b.eq 0x0099abe4
0099abc4	mov x11,x23
0099abc8	ldrb w12,[x11], #0x1
0099abcc	strb w12,[x8]
0099abd0	ldr x8,[x20, #0x8]
0099abd4	cmp x22,x11
0099abd8	add x8,x8,#0x1
0099abdc	str x8,[x20, #0x8]
0099abe0	b.ne 0x0099abc8
0099abe4	cmp x10,#0x1
0099abe8	b.ge 0x0099abf8
0099abec	b 0x0099acd0
0099abf0	mov x8,x9
0099abf4	mov x23,x22
0099abf8	add x10,x19,x27
0099abfc	sub x11,x8,x27
0099ac00	cmp x11,x9
0099ac04	sub x2,x8,x10
0099ac08	b.cs 0x0099ac40
0099ac0c	sub x11,x10,x8
0099ac10	add x12,x8,x19
0099ac14	sub x11,x11,x19
0099ac18	add x9,x9,x11
0099ac1c	sub x10,x12,x10
0099ac20	mov x11,x8
0099ac24	ldrb w12,[x10], #0x1
0099ac28	subs x9,x9,#0x1
0099ac2c	strb w12,[x11]
0099ac30	ldr x11,[x20, #0x8]
0099ac34	add x11,x11,#0x1
0099ac38	str x11,[x20, #0x8]
0099ac3c	b.ne 0x0099ac24
0099ac40	cbz x2,0x0099ac50
0099ac44	sub x0,x8,x2
0099ac48	mov x1,x19
0099ac4c	bl 0x00c2ff60
0099ac50	subs x9,x23,x21
0099ac54	b.eq 0x0099acd0
0099ac58	cmp x9,#0x20
0099ac5c	mov x8,x19
0099ac60	mov x10,x21
0099ac64	b.cc 0x0099acc0
0099ac68	cmp x19,x23
0099ac6c	b.cs 0x0099ac88
0099ac70	sub x8,x19,x21
0099ac74	add x8,x23,x8
0099ac78	cmp x8,x21
0099ac7c	mov x8,x19
0099ac80	mov x10,x21
0099ac84	b.hi 0x0099acc0
0099ac88	and x11,x9,#-0x20
0099ac8c	add x12,x21,#0x10
0099ac90	add x8,x19,x11
0099ac94	add x10,x21,x11
0099ac98	add x13,x19,#0x10
0099ac9c	mov x14,x11
0099aca0	ldp q0,q1,[x12, #-0x10]
0099aca4	add x12,x12,#0x20
0099aca8	subs x14,x14,#0x20
0099acac	stp q0,q1,[x13, #-0x10]
0099acb0	add x13,x13,#0x20
0099acb4	b.ne 0x0099aca0
0099acb8	cmp x11,x9
0099acbc	b.eq 0x0099acd0
0099acc0	ldrb w9,[x10], #0x1
0099acc4	cmp x23,x10
0099acc8	strb w9,[x8], #0x1
0099accc	b.ne 0x0099acc0
0099acd0	mov x23,x19
0099acd4	b 0x0099ade4
0099acd8	orr x24,xzr,#0x7fffffffffffffff
0099acdc	mov x0,x24
0099ace0	bl 0x00c2fed0
0099ace4	mov x26,x0
0099ace8	cmp x21,x22
0099acec	add x23,x26,x23
0099acf0	b.eq 0x0099ad88
0099acf4	sub x8,x19,x21
0099acf8	sub x8,x8,x25
0099acfc	cmp x27,#0x20
0099ad00	add x8,x22,x8
0099ad04	mov x9,x23
0099ad08	mov x10,x21
0099ad0c	b.cc 0x0099ad6c
0099ad10	cmp x23,x22
0099ad14	b.cs 0x0099ad2c
0099ad18	add x9,x26,x8
0099ad1c	cmp x9,x21
0099ad20	mov x9,x23
0099ad24	mov x10,x21
0099ad28	b.hi 0x0099ad6c
0099ad2c	add x13,x19,#0x10
0099ad30	and x11,x27,#-0x20
0099ad34	sub x13,x13,x25
0099ad38	add x12,x21,#0x10
0099ad3c	add x9,x23,x11
0099ad40	add x10,x21,x11
0099ad44	add x13,x26,x13
0099ad48	mov x14,x11
0099ad4c	ldp q0,q1,[x12, #-0x10]
0099ad50	add x12,x12,#0x20
0099ad54	subs x14,x14,#0x20
0099ad58	stp q0,q1,[x13, #-0x10]
0099ad5c	add x13,x13,#0x20
0099ad60	b.ne 0x0099ad4c
0099ad64	cmp x11,x27
0099ad68	b.eq 0x0099ad7c
0099ad6c	ldrb w11,[x10], #0x1
0099ad70	cmp x22,x10
0099ad74	strb w11,[x9], #0x1
0099ad78	b.ne 0x0099ad6c
0099ad7c	ldr x25,[x20]
0099ad80	add x21,x26,x8
0099ad84	b 0x0099ad8c
0099ad88	mov x21,x23
0099ad8c	sub x2,x19,x25
0099ad90	cmp x2,#0x1
0099ad94	sub x22,x23,x2
0099ad98	b.lt 0x0099ada8
0099ad9c	mov x0,x22
0099ada0	mov x1,x25
0099ada4	bl 0x00c2ffd0
0099ada8	ldr x8,[x20, #0x8]
0099adac	add x24,x26,x24
0099adb0	sub x27,x8,x19
0099adb4	cmp x27,#0x1
0099adb8	b.lt 0x0099add0
0099adbc	mov x0,x21
0099adc0	mov x1,x19
0099adc4	mov x2,x27
0099adc8	bl 0x00c2ffd0
0099adcc	add x21,x21,x27
0099add0	stp x22,x21,[x20]
0099add4	str x24,[x20, #0x10]
0099add8	cbz x25,0x0099ade4
0099addc	mov x0,x25
0099ade0	bl 0x00c301d0
0099ade4	mov x0,x23
0099ade8	ldp x29,x30,[sp, #0x50]
0099adec	ldp x20,x19,[sp, #0x40]
0099adf0	ldp x22,x21,[sp, #0x30]
0099adf4	ldp x24,x23,[sp, #0x20]
0099adf8	ldp x26,x25,[sp, #0x10]
0099adfc	ldr x27,[sp], #0x60
0099ae00	ret
0099ae04	mov x0,x20
0099ae08	bl 0x00c30bd0
