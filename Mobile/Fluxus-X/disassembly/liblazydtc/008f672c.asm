; std::__ndk1::__split_buffer<std::__ndk1::function<void()>*,std::__ndk1::allocator<std::__ndk1::function<void()>*>&>::push_front @ 008f672c
008f672c	str x25,[sp, #-0x50]!
008f6730	stp x24,x23,[sp, #0x10]
008f6734	stp x22,x21,[sp, #0x20]
008f6738	stp x20,x19,[sp, #0x30]
008f673c	stp x29,x30,[sp, #0x40]
008f6740	add x29,sp,#0x40
008f6744	ldp x8,x24,[x0]
008f6748	mov x20,x1
008f674c	mov x19,x0
008f6750	cmp x24,x8
008f6754	mov x21,x24
008f6758	b.eq 0x008f6764
008f675c	mov x22,x21
008f6760	b 0x008f68c4
008f6764	ldp x23,x9,[x19, #0x10]
008f6768	cmp x23,x9
008f676c	b.cs 0x008f67b4
008f6770	sub x8,x9,x23
008f6774	asr x8,x8,#0x3
008f6778	add x9,x8,#0x1
008f677c	add x10,x8,#0x2
008f6780	cmp x9,#0x0
008f6784	csinc x8,x10,x8,lt
008f6788	asr x25,x8,#0x1
008f678c	subs x2,x23,x24
008f6790	add x8,x23,x25, LSL #0x3
008f6794	b.eq 0x008f67d8
008f6798	sub x22,x8,x2
008f679c	mov x0,x22
008f67a0	mov x1,x21
008f67a4	bl 0x00c2ff60
008f67a8	ldr x8,[x19, #0x10]
008f67ac	add x8,x8,x25, LSL #0x3
008f67b0	b 0x008f67dc
008f67b4	subs x8,x9,x8
008f67b8	asr x8,x8,#0x2
008f67bc	csinc x25,x8,xzr,ne
008f67c0	cbz x25,0x008f67e4
008f67c4	lsr x8,x25,#0x3d
008f67c8	cbnz x8,0x008f68f0
008f67cc	lsl x0,x25,#0x3
008f67d0	bl 0x00c2fed0
008f67d4	b 0x008f67e8
008f67d8	mov x22,x8
008f67dc	stp x22,x8,[x19, #0x8]
008f67e0	b 0x008f68c4
008f67e4	mov x0,xzr
008f67e8	add x8,x25,#0x3
008f67ec	lsr x13,x8,#0x2
008f67f0	cmp x24,x23
008f67f4	add x22,x0,x13, LSL #0x3
008f67f8	add x8,x0,x25, LSL #0x3
008f67fc	b.eq 0x008f6828
008f6800	sub x9,x23,#0x8
008f6804	sub x9,x9,x24
008f6808	lsr x12,x9,#0x3
008f680c	add x10,x12,x13
008f6810	add x11,x12,#0x1
008f6814	cmp x11,#0x4
008f6818	add x9,x10,#0x1
008f681c	b.cs 0x008f6830
008f6820	mov x10,x22
008f6824	b 0x008f6894
008f6828	mov x9,x22
008f682c	b 0x008f68ac
008f6830	add x12,x24,x12, LSL #0x3
008f6834	add x12,x12,#0x8
008f6838	cmp x22,x12
008f683c	b.cs 0x008f6854
008f6840	add x10,x0,x10, LSL #0x3
008f6844	add x10,x10,#0x8
008f6848	cmp x24,x10
008f684c	mov x10,x22
008f6850	b.cc 0x008f6894
008f6854	and x12,x11,#0x3ffffffffffffffc
008f6858	add x13,x0,x13, LSL #0x3
008f685c	lsl x15,x12,#0x3
008f6860	add x14,x24,#0x10
008f6864	add x10,x22,x15
008f6868	add x21,x24,x15
008f686c	add x13,x13,#0x10
008f6870	mov x15,x12
008f6874	ldp q0,q1,[x14, #-0x10]
008f6878	add x14,x14,#0x20
008f687c	subs x15,x15,#0x4
008f6880	stp q0,q1,[x13, #-0x10]
008f6884	add x13,x13,#0x20
008f6888	b.ne 0x008f6874
008f688c	cmp x11,x12
008f6890	b.eq 0x008f68a4
008f6894	ldr x11,[x21], #0x8
008f6898	cmp x23,x21
008f689c	str x11,[x10], #0x8
008f68a0	b.ne 0x008f6894
008f68a4	ldr x21,[x19]
008f68a8	add x9,x0,x9, LSL #0x3
008f68ac	stp x0,x22,[x19]
008f68b0	stp x9,x8,[x19, #0x10]
008f68b4	cbz x21,0x008f68c4
008f68b8	mov x0,x21
008f68bc	bl 0x00c301d0
008f68c0	ldr x22,[x19, #0x8]
008f68c4	ldr x8,[x20]
008f68c8	stur x8,[x22, #-0x8]
008f68cc	ldr x8,[x19, #0x8]
008f68d0	sub x8,x8,#0x8
008f68d4	str x8,[x19, #0x8]
008f68d8	ldp x29,x30,[sp, #0x40]
008f68dc	ldp x20,x19,[sp, #0x30]
008f68e0	ldp x22,x21,[sp, #0x20]
008f68e4	ldp x24,x23,[sp, #0x10]
008f68e8	ldr x25,[sp], #0x50
008f68ec	ret
008f68f0	mov w0,#0x10
008f68f4	bl 0x00c30000
008f68f8	mov x19,x0
008f68fc	adrp x1,0x2ad000
008f6900	add x1,x1,#0x51
008f6904	bl 0x00c30040
008f6908	adrp x8,0xcb4000
008f690c	ldr x8,[x8, #0x980]
008f6910	adrp x1,0xcb4000
008f6914	adrp x2,0xcb4000
008f6918	mov x0,x19
008f691c	add x8,x8,#0x10
008f6920	str x8,[x19]
008f6924	ldr x1,[x1, #0x970]
008f6928	ldr x2,[x2, #0x978]
008f692c	bl 0x00c30020
