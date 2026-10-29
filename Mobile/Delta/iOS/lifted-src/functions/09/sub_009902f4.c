/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9902f4..0x990348 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9902f4_0 {
    struct st_9902f4_1 *field_0;
    unsigned long long field_8;
} st_9902f4_0;

typedef struct st_9902f4_1 {
    char field_0;
} st_9902f4_1;


int sub_9902f4(st_9902f4_0 *a0, unsigned long long *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_8)
    {
        return 0;
    }
    else if (1 << ((char)(*(char *)a0->field_0) >> 6 & 63) > a0->field_8)
    {
        return 0;
    }
    else
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        *a1 = sub_a7b0d8(a0->field_0);
        return 1;
    }
}
