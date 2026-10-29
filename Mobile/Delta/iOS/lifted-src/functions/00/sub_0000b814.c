/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb814..0xbdd8 (1476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b814_0 {
    char field_0;
} st_b814_0;

extern unsigned long long g_e61600;

long long sub_b814(unsigned long long *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // w9
    unsigned long long v11;  // x10
    unsigned long long v12;  // 4106
    st_b814_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_b814_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = *(int *)a0;
    v11 = 384;
    if (!v10)
        v11 = 400;
    if (v10 == 0x101)
        v11 = 336;
    if (v10 == 258)
        v11 = 32;
    if (v10 == 259)
        v11 = 64;
    if (v10 == 260)
        v11 = 472;
    if (v10 == 261)
        v11 = 80;
    if (v10 == 262)
        v11 = 416;
    if (v10 == 263)
        v11 = 224;
    if (v10 == 264)
        v11 = 264;
    if (v10 == 265)
        v11 = 328;
    if (v10 == 270)
        v11 = 464;
    if (v10 == 271)
        v11 = 248;
    if (v10 == 272)
        v11 = 312;
    if (v10 == 273)
        v11 = 456;
    if (v10 == 274)
        v11 = 24;
    if (v10 == 275)
        v11 = 424;
    if (v10 == 276)
        v11 = 480;
    if (v10 == 277)
        v11 = 232;
    if ((v10 & 0xfffffffe) == 278)
        v11 = 112;
    if (v10 == 266)
        v11 = 392;
    if (v10 == 267)
        v11 = 488;
    if (v10 == 268)
        v11 = 120;
    if (v10 == 269)
        v11 = 432;
    if (v10 == 280)
        v11 = 184;
    if (v10 == 281)
        v11 = 288;
    if (v10 == 282)
        v11 = 160;
    if (v10 == 284)
        v11 = 8;
    if (v10 == 285)
        v11 = 0x100;
    if (v10 == 286)
        v11 = 304;
    v12 = arm64g_calculate_condition(3, v10, 287, 0);
    if (v12 & 1)
        v11 = 344;
    if (v10 == 289)
        v11 = 0x88;
    if (v10 == 288)
        v11 = 144;
    goto *((void *)(*(long long *)((char *)&g_e61600 + v11)));
}
