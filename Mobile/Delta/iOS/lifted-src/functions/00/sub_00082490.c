/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82490..0x826bc (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82490_0 {
    char padding_0[4];
    unsigned int field_4;
} st_82490_0;

extern unsigned long long g_e6b6a0;

unsigned long long sub_82490(void* a0, unsigned long a1, st_82490_0 *a2, unsigned int a3, unsigned int a4)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w8
    unsigned long long v10;  // 4140
    unsigned long v11;  // x9
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned int v14;  // x13
    char v15;  // x13
    unsigned int v16;  // x8
    unsigned int v17;  // x12
    unsigned long v2;  // cc_dep1
    char v3;  // x12
    unsigned long v4;  // x8
    unsigned long v5;  // 4110
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // 4110

    v0 = a4 > 0xff;
    if (!a4)
        v1 = v0 & 1;
    else
        v1 = v0 + 1;
    if (a4 & 0xffff0000)
        v1 += 1;
    v2 = (unsigned long long)a2[5].padding_0;
    if (a2[5].padding_0)
        v1 = 0;
    v3 = a2->field_4;
    v4 = 1 << (v3 & 63);
    if (a2[4].padding_0)
    {
        v5 = arm64g_calculate_condition(19, v2, 0, 0);
        v6 = 4;
        v7 = (v5 & 1 ? v4 : 0);
        v8 = (v5 & 1 ? a3 : 0);
    }
    else
    {
        v9 = arm64g_calculate_condition(19, v2, 0, 0);
        v6 = 0;
        v7 = (v9 & 1 ? v4 : 0);
        v8 = (v9 & 1 ? a3 : 0);
    }
    v10 = arm64g_calculate_condition(v6 | 48, v7, v8, 0);
    v11 = !(v10 & 1);
    v12 = a3 >> 8 > 0x100;
    if (a3 <= 0xff)
        v13 = v12 & 1;
    else
        v13 = v12 + 1;
    if (a3 > 0xfffffffe)
        v13 += 1;
    if (!a2[4].padding_0)
        v13 = 0;
    if ((unsigned int)v11)
        v14 = 32;
    else
        v14 = 0;
    if (18 > a1)
        return 0xffffffffffffffba;
    v15 = v14 | (char)v1 + ((int)a2[4].field_4 > 0) * 4 | (char)v13 * 64;
    if (a2->padding_0)
    {
        v16 = 1;
        *(char *)a0 = v15;
        if (!(v11 & 1))
            goto LABEL_82540;
    }
    else
    {
        *(unsigned int *)a0 = 4247762216;
        v16 = 5;
        *(char *)&a0[4] = v15;
        if (!(v11 & 1))
        {
LABEL_82540:
            *((char *)a0 + v16) = v3 * 8 - 80;
        }
    }
    v17 = 128;
    if (v1 == 3)
        v17 = 80;
    if (v1 == 1)
        v17 = 48;
    if (v1 == 2)
        v17 = 32;
    goto *((void *)(*(long long *)((char *)&g_e6b6a0 + v17)));
}
