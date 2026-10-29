/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3b54..0xac3be8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3b54_2 {
    char padding_0[160];
    struct st_ac3b54_0 *field_a0;
} st_ac3b54_2;

typedef struct st_ac3b54_1 {
    char padding_0[152];
    unsigned int field_98;
    char padding_9c[4];
    struct st_ac3b54_0 *field_a0;
} st_ac3b54_1;

typedef struct st_ac3b54_0 {
    char padding_0[48];
    unsigned int field_30;
} st_ac3b54_0;


unsigned int sub_ac3b54(st_ac3b54_1 *a0, st_ac3b54_2 *a1, unsigned long long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_a0 != a1->field_a0)
    {
        return 0;
    }
    else if ((unsigned int)a2 & 3)
    {
        v0 = &v2;
        v1 = v3;
        if (a2 >> 1 & 1 && *(long long *)&a0->padding_0[128] && *(long long *)&a1->padding_0[128])
        {
            if (_memcmp(*(long long *)&a0->padding_0[128], *(long long *)&a1->padding_0[128], a0->field_a0->field_30))
                return 0;
            return 1;
        }
        if (!(a2 & 1))
        {
            return 0;
        }
        else if (!a0->field_98)
        {
            return 0;
        }
        else if (!*(int *)&a1->padding_0[152])
        {
            return 0;
        }
        else if (sub_a66f20())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    else
    {
        return 1;
    }
}
