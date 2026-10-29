/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3dd60..0xc3de1c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3dd60_0 {
    unsigned long long field_0;
    unsigned short field_8;
    char field_a;
    char field_b;
} st_c3dd60_0;

extern char g_e0eb50;

st_c3dd60_0 * sub_c3dd60(st_c3dd60_0 *a0, unsigned long long a1)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x10
    char *v6;  // x8
    unsigned long v0;  // [bp-0xa]
    unsigned short v1;  // [bp-0x2]

    v2 = (unsigned int)a1 | 1;
    if (!(v2 * 0x100000000))
        v3 = 32;
    else
        v3 = Clz(v2 * 0x100000000) & 0xffffffff;
    v4 = (v3 >> 2) - 2;
    *((char *)&v0 + 2) = 0;
    v5 = a1 & 0xffffffff;
    *((char *)&v0 + 3) = (&g_e0eb50)[v5 >> 20];
    *(unsigned short *)&v0 = 0;
    *((char *)&v0 + 4) = (&g_e0eb50)[(a1 * 0x1000000000000 | a1 >> 16) & 0xffff00000000000f & 15];
    *((char *)&v0 + 5) = (&g_e0eb50)[(a1 * 0x10000000000000 | a1 >> 12) & 0xfff000000000000f & 15];
    *((char *)&v0 + 6) = (&g_e0eb50)[(a1 * 0x100000000000000 | a1 >> 8) & 0xff0000000000000f & 15];
    *((char *)&v0 + 7) = (&g_e0eb50)[(a1 * 0x1000000000000000 | a1 >> 4) & 17293822569102704655 & 15];
    v1 = CONCAT(125, (&g_e0eb50)[v5 & 15]);
    *((char *)&v0 + v4) = 92;
    v6 = (char *)&v0 + (v3 >> 2);
    *(v6 - 1) = 117;
    *v6 = 123;
    a0->field_0 = v0;
    a0->field_8 = v1;
    a0->field_a = v4;
    a0->field_b = 10;
    return a0;
}
