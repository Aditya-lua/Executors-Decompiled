; ix::make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long&,ix::WebSocketErrorInfo,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo> @ 00990540
00990540	sub sp,sp,#0x120
00990544	stp x28,x27,[sp, #0xc0]
00990548	stp x26,x25,[sp, #0xd0]
0099054c	stp x24,x23,[sp, #0xe0]
00990550	stp x22,x21,[sp, #0xf0]
00990554	stp x20,x19,[sp, #0x100]
00990558	stp x29,x30,[sp, #0x110]
0099055c	add x29,sp,#0x110
00990560	mrs x27,tpidr_el0
00990564	mov x20,x8
00990568	ldr x8,[x27, #0x28]
0099056c	mov x26,x0
00990570	mov w0,#0xc8
00990574	mov x22,x5
00990578	mov x23,x4
0099057c	mov x24,x3
00990580	mov x25,x2
00990584	mov x21,x1
00990588	stur x8,[x29, #-0x60]
0099058c	bl 0x00c2fed0
00990590	ldr w8,[x24, #0x10]
00990594	ldr w1,[x26]
00990598	ldr x3,[x25]
0099059c	mov x9,sp
009905a0	str w8,[sp, #0x80]
009905a4	ldr q0,[x24]
009905a8	mov x19,x0
009905ac	add x9,x9,#0x20
009905b0	str q0,[sp, #0x70]
009905b4	ldr x8,[x24, #0x28]
009905b8	str x8,[sp, #0x98]
009905bc	ldur q0,[x24, #0x18]
009905c0	stur q0,[sp, #0x88]
009905c4	ldrb w8,[x24, #0x30]
009905c8	stp xzr,xzr,[x24, #0x18]
009905cc	str xzr,[x24, #0x28]
009905d0	strb w8,[sp, #0xa0]
009905d4	ldr x8,[x23, #0x10]
009905d8	str x8,[sp, #0x10]
009905dc	ldr q0,[x23]
009905e0	str q0,[sp]
009905e4	ldr x8,[x23, #0x18]
009905e8	stp xzr,xzr,[x23]
009905ec	str xzr,[x23, #0x10]
009905f0	str x8,[sp, #0x18]
009905f4	ldp x8,x10,[x23, #0x20]
009905f8	stp x8,x10,[sp, #0x20]
009905fc	cbz x10,0x00990618
00990600	str x9,[x8, #0x10]
00990604	mov x8,x23
00990608	str xzr,[x8, #0x20]!
0099060c	stur x8,[x8, #-0x8]
00990610	str xzr,[x8, #0x8]
00990614	b 0x0099061c
00990618	str x9,[sp, #0x18]
0099061c	ldr x8,[x23, #0x40]
00990620	str x8,[sp, #0x40]
00990624	ldr q0,[x23, #0x30]
00990628	str q0,[sp, #0x30]
0099062c	stp xzr,xzr,[x23, #0x38]
00990630	str xzr,[x23, #0x30]
00990634	ldrh w8,[x22]
00990638	strh w8,[sp, #0x48]
0099063c	ldr x8,[x22, #0x18]
00990640	str x8,[sp, #0x60]
00990644	ldur q0,[x22, #0x8]
00990648	stur q0,[sp, #0x50]
0099064c	ldrb w8,[x22, #0x20]
00990650	stp xzr,xzr,[x22, #0x10]
00990654	str xzr,[x22, #0x8]
00990658	strb w8,[sp, #0x68]
0099065c	add x4,sp,#0x70
00990660	mov x5,sp
00990664	add x6,sp,#0x48
00990668	mov x0,x19
0099066c	mov x2,x21
00990670	mov w7,wzr
00990674	bl 0x00c337c0
00990678	ldrb w8,[sp, #0x50]
0099067c	str x19,[x20]
00990680	tbz w8,#0x0,0x0099068c
00990684	ldr x0,[sp, #0x60]
00990688	bl 0x00c301d0
0099068c	ldrb w8,[sp, #0x30]
00990690	tbz w8,#0x0,0x0099069c
00990694	ldr x0,[sp, #0x40]
00990698	bl 0x00c301d0
0099069c	ldr x1,[sp, #0x20]
009906a0	mov x8,sp
009906a4	add x0,x8,#0x18
009906a8	bl 0x00c32fc0
009906ac	ldrb w8,[sp]
009906b0	tbz w8,#0x0,0x009906bc
009906b4	ldr x0,[sp, #0x10]
009906b8	bl 0x00c301d0
009906bc	ldrb w8,[sp, #0x88]
009906c0	tbz w8,#0x0,0x009906cc
009906c4	ldr x0,[sp, #0x98]
009906c8	bl 0x00c301d0
009906cc	ldr x8,[x27, #0x28]
009906d0	ldur x9,[x29, #-0x60]
009906d4	cmp x8,x9
009906d8	b.ne 0x009906fc
009906dc	ldp x29,x30,[sp, #0x110]
009906e0	ldp x20,x19,[sp, #0x100]
009906e4	ldp x22,x21,[sp, #0xf0]
009906e8	ldp x24,x23,[sp, #0xe0]
009906ec	ldp x26,x25,[sp, #0xd0]
009906f0	ldp x28,x27,[sp, #0xc0]
009906f4	add sp,sp,#0x120
009906f8	ret
009906fc	bl 0x00c2fec0
