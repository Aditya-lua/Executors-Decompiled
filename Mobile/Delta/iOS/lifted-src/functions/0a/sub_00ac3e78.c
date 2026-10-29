/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3e78..0xac3ff0 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3e78_1 {
    char padding_0[160];
    struct st_ac3e78_0 *field_a0;
} st_ac3e78_1;

typedef struct st_ac3e78_4 {
    char padding_0[168];
    struct st_ac3e78_2 *field_a8;
} st_ac3e78_4;

typedef struct st_ac3e78_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac3e78_0;

typedef struct st_ac3e78_2 {
    char padding_0[72];
    struct st_ac3e78_3 *field_48;
} st_ac3e78_2;

typedef struct st_ac3e78_3 {
    unsigned long long field_0;
} st_ac3e78_3;

extern char g_10002b0;

unsigned long long sub_ac3e78(st_ac3e78_4 **a0, st_ac3e78_1 *ptr, long long a2, unsigned long long a3, unsigned long long n)
{
    unsigned long v3;  // x24
    unsigned long long v4;  // x20
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    v3 = ptr->field_a0->field_10;
    v4 = v3 * 2;
    if (a3 && n)
    {
        if (v3 * 3 == n)
        {
            _memcpy(ptr, a3, n);
LABEL_ac3f24:
            *a0->field_a8->field_48();
        }
    }
    else
    {
        if ((int)sub_aa845c(a2, ptr, v4, 0) >= 1 && (int)sub_aa8658(a2, &ptr->padding_0[2 * v3], v3, 0) >= 1)
            goto LABEL_ac3f24;
    }
    *(unsigned long long *)&ptr->padding_0[128] = 0;
    *(unsigned int *)&ptr->padding_0[152] = 0;
    sub_a66ec0(ptr, v4);
    if (*(long long *)&g_10002b0 == v0)
        return 0;
    ___stack_chk_fail();
}
