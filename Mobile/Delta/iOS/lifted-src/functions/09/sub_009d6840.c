/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d6840..0x9d693c (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d6840_1 {
    char padding_0[216];
    unsigned int field_d8;
    unsigned int field_dc;
} st_9d6840_1;

typedef struct st_9d6840_0 {
    char padding_0[56];
    unsigned int field_38;
    char padding_3c[4];
    struct st_9d6840_1 *field_40;
} st_9d6840_0;


unsigned long long sub_9d6840(st_9d6840_0 *a0, long long a1, int a2)
{
    unsigned int *v2;  // x19
    unsigned long long count;  // x0
    long long v4;  // x0
    long long v5;  // x0
    unsigned int v6;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_40;
    *(unsigned int *)___error() = 0;
    if (v2[54])
    {
        count = _write(a0->field_38, a1, a2);
    }
    else
    {
        v4 = sub_9d367c(v2);
        v5 = sub_c044(v2);
        count = _sendto(a0->field_38, a1, a2, 0, v5, v4);
    }
    sub_9d3d58(a0, 15);
    if (1 < (unsigned int)count + 1)
        return count;
    v6 = *(int *)___error();
    if ((37 < v6 || !(1 << ((char)v6 & 63) & 240518168592)) && v6 != 100)
        return count;
    v2[55] = *(int *)___error(sub_9d3d74(a0, 10), 10);
    return count;
}
