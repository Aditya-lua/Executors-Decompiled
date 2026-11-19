; std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>::swap @ 00994784
00994784	sub sp,sp,#0x60
00994788	str x21,[sp, #0x30]
0099478c	stp x20,x19,[sp, #0x40]
00994790	stp x29,x30,[sp, #0x50]
00994794	add x29,sp,#0x50
00994798	mrs x21,tpidr_el0
0099479c	ldr x8,[x21, #0x28]
009947a0	mov x19,x1
009947a4	mov x20,x0
009947a8	cmp x1,x0
009947ac	str x8,[sp, #0x28]
009947b0	b.eq 0x009948bc
009947b4	ldr x0,[x20, #0x20]
009947b8	cmp x0,x20
009947bc	b.eq 0x009947d8
009947c0	ldr x8,[x19, #0x20]
009947c4	cmp x19,x8
009947c8	b.eq 0x00994810
009947cc	str x8,[x20, #0x20]
009947d0	str x0,[x19, #0x20]
009947d4	b 0x009948bc
009947d8	ldr x8,[x19, #0x20]
009947dc	cmp x8,x19
009947e0	b.eq 0x00994844
009947e4	ldr x8,[x0]
009947e8	ldr x8,[x8, #0x18]
009947ec	mov x1,x19
009947f0	blr x8
009947f4	ldr x0,[x20, #0x20]
009947f8	ldr x8,[x0]
009947fc	ldr x8,[x8, #0x20]
00994800	blr x8
00994804	ldr x8,[x19, #0x20]
00994808	str x8,[x20, #0x20]
0099480c	b 0x009948b8
00994810	ldr x9,[x8]
00994814	ldr x9,[x9, #0x18]
00994818	mov x0,x8
0099481c	mov x1,x20
00994820	blr x9
00994824	ldr x0,[x19, #0x20]
00994828	ldr x8,[x0]
0099482c	ldr x8,[x8, #0x20]
00994830	blr x8
00994834	ldr x8,[x20, #0x20]
00994838	str x8,[x19, #0x20]
0099483c	str x20,[x20, #0x20]
00994840	b 0x009948bc
00994844	ldr x8,[x0]
00994848	ldr x8,[x8, #0x18]
0099484c	mov x1,sp
00994850	blr x8
00994854	ldr x0,[x20, #0x20]
00994858	ldr x8,[x0]
0099485c	ldr x8,[x8, #0x20]
00994860	blr x8
00994864	str xzr,[x20, #0x20]
00994868	ldr x0,[x19, #0x20]
0099486c	ldr x8,[x0]
00994870	ldr x8,[x8, #0x18]
00994874	mov x1,x20
00994878	blr x8
0099487c	ldr x0,[x19, #0x20]
00994880	ldr x8,[x0]
00994884	ldr x8,[x8, #0x20]
00994888	blr x8
0099488c	str xzr,[x19, #0x20]
00994890	str x20,[x20, #0x20]
00994894	ldr x8,[sp]
00994898	ldr x8,[x8, #0x18]
0099489c	mov x0,sp
009948a0	mov x1,x19
009948a4	blr x8
009948a8	ldr x8,[sp]
009948ac	mov x0,sp
009948b0	ldr x8,[x8, #0x20]
009948b4	blr x8
009948b8	str x19,[x19, #0x20]
009948bc	ldr x8,[x21, #0x28]
009948c0	ldr x9,[sp, #0x28]
009948c4	cmp x8,x9
009948c8	b.ne 0x009948e0
009948cc	ldp x29,x30,[sp, #0x50]
009948d0	ldp x20,x19,[sp, #0x40]
009948d4	ldr x21,[sp, #0x30]
009948d8	add sp,sp,#0x60
009948dc	ret
009948e0	bl 0x00c2fec0
