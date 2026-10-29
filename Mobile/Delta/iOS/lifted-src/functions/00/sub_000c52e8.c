/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc52e8..0xc569c (948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c52e8_0 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_c52e8_0;

extern unsigned long long g_e6ccc8;

unsigned long long sub_c52e8(st_c52e8_0 *a0, unsigned long long ptr, unsigned long long n, unsigned long long a3)
{
    st_c52e8_0 *ptr1;  // x8
    unsigned long long v4;  // x0
    unsigned int v13;  // w9
    unsigned long long v5;  // x19
    unsigned long long v6;  // x22
    unsigned long long v7;  // x0
    char *v8;  // x10
    unsigned long v9;  // x9
    unsigned long long v10;  // w14
    unsigned long long v11;  // x15
    unsigned long long v12;  // x14
    unsigned int v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    ptr1 = a0;
    if (!(unsigned int)a3)
        v4 = 5;
    else
        v4 = 1;
    if (!ptr && n)
        return 0xffffffffffffffff;
    if (v4 > n)
    {
        if (!n)
        {
            return v4;
        }
        else if ((unsigned int)a3 == 1)
        {
            return v4;
        }
        else
        {
            v0 = 4247762216;
            _memcpy(&v0);
            if (v0 == 4247762216)
                return v4;
            v0 = 407710288;
            _memcpy(&v0, ptr, n);
            if ((v0 & 0xfffffff0) != 407710288)
                return 0xfffffffffffffff6;
            return v4;
        }
    }
    memset(ptr1, 0, 48);
    if ((unsigned int)a3 == 1)
    {
        a3 = 1;
    }
    else if (*(int *)ptr != 4247762216)
    {
        if (((unsigned int)(*(int *)ptr) >> 4 & 0xfffffff) != 25481893)
        {
            return 0xfffffffffffffff6;
        }
        else if (n < 8)
        {
            return 8;
        }
        else
        {
            *(unsigned int *)&ptr1->padding_8[12] = 1;
            v13 = *(int *)ptr;
            *(unsigned int *)&ptr1->padding_8[16] = 8;
            ptr1->field_1c = v13 + 3887257008;
            ptr1->field_0 = *(int *)(ptr + 4);
            return 0;
        }
    }
    v5 = ptr;
    v6 = n;
    v7 = sub_c4cb4(ptr, n, a3);
    if (v6 < v7)
        return v7;
    *(unsigned int *)&ptr1->padding_8[16] = v7;
    v8 = v5 + v4;
    v9 = *(v8 - 1);
    if (v9 >> 3 & 1)
        return 0xfffffffffffffff2;
    if (!(v9 >> 5 & 1) && *v8 > 175)
        return 0xfffffffffffffff0;
    v10 = (unsigned int)v9 & 3;
    v11 = 32;
    if (v10 == 3)
        v11 = 80;
    if (v10 == 1)
        v11 = 328;
    v12 = 24;
    if (v10 != 2)
        v12 = v11;
    goto *((void *)(*(long long *)((char *)&g_e6ccc8 + v12)));
}
